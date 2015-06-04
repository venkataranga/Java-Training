package com.javatrainig.j2ee.jsp.pojo;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionIdListener;
import javax.servlet.http.HttpSessionListener;

public class SessionListener implements HttpSessionListener,
		HttpSessionIdListener {
	
	@Override
	public void sessionIdChanged(HttpSessionEvent arg0, String arg1) {
		System.out.println("Old Session ID: "+arg1+", New Session ID: "+arg0.getSession().getId());
	}

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("Session with ID: "+arg0.getSession().getId()+" is created");

	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println("Session with ID: "+arg0.getSession().getId()+" is destroyed");
	}

}
