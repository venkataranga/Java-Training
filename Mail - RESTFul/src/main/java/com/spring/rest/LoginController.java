package com.spring.rest;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spring.rest.pojo.Login;
import com.spring.rest.pojo.Mail;
import com.spring.rest.pojo.User;
import com.spring.rest.services.LoginService;

@Controller
@RequestMapping("/login")
@SessionAttributes("emails")
public class LoginController {
	
	@Autowired
	LoginService loginSer;

	public LoginService getLoginSer() {
		return loginSer;
	}

	public void setLoginSer(LoginService loginSer) {
		this.loginSer = loginSer;
	}

	@RequestMapping(method=RequestMethod.GET)
	public String showLoginPage(Login login){
		return "login";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String login(@Valid Login login, Errors errors, Model model){
		if(errors.hasErrors()){
			System.out.println("LoginController");
			return "login";
		}
		User user = loginSer.login(login);
		if(user==null){
			errors.rejectValue("loginError", "invalid.login");
			return "login";
		}
		Mail email = new Mail();
		email.setFrom("d");
		email.setId(123);
		email.setMessage("sample");
		email.setSubject("sample");
		user.addMail(email);
		
		model.addAttribute("emails", user.getEmails());
		return "home";
	}
}
