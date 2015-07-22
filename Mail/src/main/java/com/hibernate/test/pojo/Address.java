package com.hibernate.test.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name= "address_id")
	long address_id;
	
	String houseno;
	String street;
	String apt;
	String city;
	String state;
	String country;
	String type;
	
	/*long user_id;

	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}*/
	
	@ManyToOne
	@JoinColumn(name="user_id")
	Person person;
	
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public long getAddress_id() {
		return address_id;
	}
	public void setAddress_id(long address_id) {
		this.address_id = address_id;
	}
	public String getHouseno() {
		return houseno;
	}
	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getApt() {
		return apt;
	}
	public void setApt(String apt) {
		this.apt = apt;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
