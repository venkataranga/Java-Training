package com.spring.rest.services;

import com.spring.rest.pojo.Login;
import com.spring.rest.pojo.User;

public interface LoginService {

	User login(Login login);
	
}
