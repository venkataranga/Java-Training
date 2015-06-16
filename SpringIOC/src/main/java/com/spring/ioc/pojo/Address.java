package com.spring.ioc.pojo;

public class Address {

	int houseNumber;
	String streetAddress;
	int apt;
	String city;
	int zipcode;
	String state;
	
	
	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	
	public int getApt() {
		return apt;
	}
	public void setApt(int apt) {
		this.apt = apt;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", streetAddress="
				+ streetAddress + ", apt=" + apt + ", city=" + city
				+ ", zipcode=" + zipcode + ", state=" + state + "]";
	}
}
