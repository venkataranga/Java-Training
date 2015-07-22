package com.java.training.apache.struts2;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport{
	
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String hello(){
		return "failed";
	}
	
	public String welcomeUser(){
		System.out.println("Name is "+name);
		return "success";
	}
	
	public String error(){
		return "failed";
	}
	
}
