package com.spring.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.pojo.User;
import com.spring.mvc.services.RegistrationService;
import com.spring.mvc.validations.RegistrationValidation;

@Controller
@RequestMapping("/register")
public class RegistrationController {

	@Autowired
	RegistrationService reg;
	
	
	
	public RegistrationService getReg() {
		return reg;
	}

	public void setReg(RegistrationService reg) {
		this.reg = reg;
	}

	@RequestMapping(method=RequestMethod.GET)
	public String showRegistrationPage(User user){
		return "register";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView registerUser(@Valid User user, BindingResult result, HttpServletRequest req){
		System.out.println(user);
		System.out.println(reg);
		System.out.println("result.hasErrors(): "+result.hasErrors());
		if(result.hasErrors())
			return new ModelAndView("register");
		reg.register(user);
		req.changeSessionId();
		return new ModelAndView("home", "emails", user.getEmails());
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		binder.setValidator(new RegistrationValidation());
	}
}
