package com.spring.mvc.pojo;

import java.io.Serializable;

public class Mail implements Serializable{

	int id;
	String from;
	String to;
	String subject;
	String message;
	
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "Mail [from=" + from + ", subject=" + subject + ", message="
				+ message + "]";
	}
	
	
	
}
