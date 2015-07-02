package com.spring.rest.services;

import org.springframework.stereotype.Service;

import com.spring.rest.database.MailDatabase;
import com.spring.rest.pojo.Login;
import com.spring.rest.pojo.User;


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
