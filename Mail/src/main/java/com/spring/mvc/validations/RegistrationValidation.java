package com.spring.mvc.validations;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.spring.mvc.database.MailDatabase;
import com.spring.mvc.pojo.User;

public class RegistrationValidation implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		System.out.println();
		return User.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
		
		
		User user = (User)arg0;
		System.out.println("in validation method: "+user);
		if("".equals(user.getFirstName().trim())){
			arg1.rejectValue("firstName", "firstname.error");
		}
			
		if("".equals(user.getLastName().trim())){
			arg1.rejectValue("lastName", "lastname.error");
		}
		
		if("".equals(user.getEmail().trim()) || !user.getEmail().contains("@") || (user.getEmail().indexOf("@")!=user.getEmail().lastIndexOf("@"))){
			arg1.rejectValue("email", "email.error");
		}
		
		if("".equals(user.getPassword())){
			arg1.rejectValue("password", "password.error");
		}
		if(MailDatabase.users.containsKey(user.getEmail())){
			arg1.rejectValue("email", "email.already.registered");
		}
	}

}
