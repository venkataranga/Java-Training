package com.spring.ioc.pojo;

import java.util.List;
import java.util.Map;

public class User {

	String firstName;
	String middleInitial;
	String lastName;
	Address shippingAddress;
	Address billingAddress;
	String email;
	String phoneNumber;
	List<Account> accounts;
	Map<String,String> map;
	Person p;
	public Person getP() {
		return p;
	}

	public void setP(Person p) {
		this.p = p;
	}

	public User(){
		
	}
	
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleInitial() {
		return middleInitial;
	}
	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Address getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public Address getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public List<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", middleInitial="
				+ middleInitial + ", lastName=" + lastName
				+ ", shippingAddress=" + shippingAddress + ", billingAddress="
				+ billingAddress + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", accounts=" + accounts + ", map=" + map + "]";
	}
	
	public static User getInstance(){
		System.out.println("Creating new user from getInstance method");
		return new User();
	}
	
}
