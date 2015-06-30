package com.spring.mvc.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable{

	
	String firstName;
	String lastName;
	String email;
	String password;
	List<Mail> emails = new ArrayList<>();
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Mail> getEmails() {
		return emails;
	}
	public void setEmails(List<Mail> emails) {
		this.emails = emails;
	}
	
	public void addMail(Mail mail){
		this.emails.add(mail);
	}
	
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", password=" + password + ", emails="
				+ emails + "]";
	}
	
}
