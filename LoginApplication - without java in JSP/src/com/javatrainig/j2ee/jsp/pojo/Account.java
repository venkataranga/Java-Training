package com.javatrainig.j2ee.jsp.pojo;

import java.io.Serializable;

public class Account implements Serializable {
	
	private String accName;
	private String accType;
	private int balance;
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

}
