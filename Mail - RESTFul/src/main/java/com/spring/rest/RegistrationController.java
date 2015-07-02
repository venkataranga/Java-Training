package com.spring.rest;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.rest.pojo.Mail;
import com.spring.rest.pojo.User;
import com.spring.rest.services.RegistrationService;
import com.spring.rest.validations.RegistrationValidation;

@RestController
public class RegistrationController {

	@Autowired
	RegistrationService reg;
	
	
	
	public RegistrationService getReg() {
		return reg;
	}

	public void setReg(RegistrationService reg) {
		this.reg = reg;
	}

	@RequestMapping(value="/register",method=RequestMethod.GET)
	public @ResponseBody User showRegistrationPage(){
		System.out.println("on get method");
		User user = new User();
		user.setFirstName("Java");
		user.setLastName("training");
		user.setEmail("java@training.com");
		user.setPassword("password");
		
		Mail mail1 = new Mail();
		mail1.setId(1);
		mail1.setTo("venkat");
		mail1.setFrom("harsha");
		mail1.setSubject("Training Video");
		mail1.setMessage("Please send me Training video");
		
		Mail mail2 = new Mail();
		mail2.setId(2);
		mail2.setFrom("venkat");
		mail2.setTo("harsha");
		mail2.setSubject("RE: Training Video");
		mail2.setMessage("here is the Training video");
		
		List<Mail> emails = new ArrayList<>();
		emails.add(mail1);
		emails.add(mail2);
		
		user.setEmails(emails);
		
		return user;
		
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public @ResponseBody User registerUser(@RequestBody @Valid User user, BindingResult result, HttpServletRequest req){
		System.out.println(user);
		System.out.println(reg);
		System.out.println("result.hasErrors(): "+result.hasErrors());
		if(result.hasErrors())
			return null;
		reg.register(user);
		return user;
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		binder.setValidator(new RegistrationValidation());
	}
}
