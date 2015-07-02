package com.spring.rest.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.spring.rest.database.MailDatabase;
import com.spring.rest.pojo.User;

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
