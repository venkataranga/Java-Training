package com.spring.mvc.pojo;

import java.io.Serializable;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class Login implements Serializable{

	@Email
	@NotEmpty(message="Email cannot be empty")
	String email;
	@NotEmpty(message="Password cannot be empty")
	String password;
	
	String loginError;
	
	
	
	public String getLoginError() {
		return loginError;
	}
	public void setLoginError(String loginError) {
		this.loginError = loginError;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
