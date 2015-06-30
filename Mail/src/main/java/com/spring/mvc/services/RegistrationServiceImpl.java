package com.spring.mvc.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.spring.mvc.database.MailDatabase;
import com.spring.mvc.pojo.User;

@Service
@Primary
public class RegistrationServiceImpl implements RegistrationService {

	@Override
	public void register(User user) {
		
		synchronized (MailDatabase.class) {
			
			MailDatabase.users.put(user.getEmail(), user);
			
		}

	}

}
