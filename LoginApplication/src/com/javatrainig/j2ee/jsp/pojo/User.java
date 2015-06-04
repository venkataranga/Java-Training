package com.javatrainig.j2ee.jsp.pojo;

import java.io.Serializable;
import java.util.List;
import java.util.Vector;

public class User implements Serializable{

	private static final long serialVersionUID = -6833886878824301896L;
	
	String firstName;
	String lastName;
	String userId;
	String password;
	List<Account> accounts = new Vector<Account>();
	
	public List<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
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
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void addAccount(Account acc){
		this.accounts.add(acc);
	}
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName
				+ ", userId=" + userId + ", password=" + password
				+ ", accounts=" + accounts + "]";
	}
	
}
