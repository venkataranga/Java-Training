package com.java.training.apache.struts2;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.java.training.apache.struts2.pojo.DB;
import com.java.training.apache.struts2.pojo.User;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction  extends ActionSupport implements RequestAware, ServletRequestAware{

	
	HelloAction ha;
	
	
	
	public HelloAction getHa() {
		return ha;
	}



	public void setHa(HelloAction ha) {
		this.ha = ha;
	}

	HttpServletRequest req;
	private static final long serialVersionUID = 1L;
	User user = new User();
	
	
	
	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public String register(){
		System.out.println(ha);
		System.out.println(user);
		if(DB.db.containsKey(user.getUsername())){
			return "input";
		}
		
		DB.db.put(user.getUsername(),user);
		return "success";
			
		
	}
	@Override
	public void validate() {
		if(null==user.getFirstname() || "".equals(user.getFirstname()))
			addFieldError("username", "Username cannot be empty");
	}



	public void setRequest(Map<String, Object> request) {
		// TODO Auto-generated method stub
		
	}
	
	 public void setServletRequest(HttpServletRequest request){
		 this.req = request;
	 }
}
