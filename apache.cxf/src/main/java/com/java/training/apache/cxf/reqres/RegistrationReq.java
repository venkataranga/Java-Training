package com.java.training.apache.cxf.reqres;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.java.training.apache.cxf.pojo.User;

@XmlRootElement
public class RegistrationReq implements Serializable{

	//@XmlElement
	User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
