package com.spring.ioc.pojo;

public class Account {

	String bankName;
	String routingNumber;
	String accountNumber;
	String accountType;
	int balance;
	
	
	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	public Account(String bankName, String routingNumber, String accountNumber,
			String accountType) {
		super();
		this.bankName = bankName;
		this.routingNumber = routingNumber;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
	}
	
	public Account(int balance, String bankName){
		this.balance = balance;
		this.bankName = bankName;
	}
	
	public Account(String accountType, int balance){
		this.accountType=accountType;
		this.balance = balance;
	}
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getRoutingNumber() {
		return routingNumber;
	}
	public void setRoutingNumber(String routingNumber) {
		this.routingNumber = routingNumber;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	@Override
	public String toString() {
		return "Account [bankName=" + bankName + ", routingNumber="
				+ routingNumber + ", accountNumber=" + accountNumber
				+ ", accountType=" + accountType + "]";
	}
	
	
}
