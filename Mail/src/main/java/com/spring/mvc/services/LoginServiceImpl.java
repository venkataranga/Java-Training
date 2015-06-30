package com.spring.mvc.services;

import org.springframework.stereotype.Service;

import com.spring.mvc.database.MailDatabase;
import com.spring.mvc.pojo.Login;
import com.spring.mvc.pojo.User;


@Service
public class LoginServiceImpl implements LoginService {

	@Override
	public User login(Login login) {
		
		if(!MailDatabase.users.containsKey(login.getEmail()))
			return null;
		else if(!MailDatabase.users.get(login.getEmail()).getPassword().equals(login.getPassword()))
			return null;
		else
			return MailDatabase.users.get(login.getEmail());
		
	}

}
