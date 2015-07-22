package com.hibernate.test.pojo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import javax.persistence.NamedQueries;

@Entity
@Table(name="Person")
@NamedQueries(value={@NamedQuery(name="namedQuery", query = "from Person")})
public class Person {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long id;
	
	@Column(name="firstname")
	String firstname;
	String lastname;
	String email;
	String phonenumber;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="person")
	List<Address> userAddresses;
	
	
	
	public List<Address> getUserAddresses() {
		return userAddresses;
	}
	public void setUserAddresses(List<Address> userAddresses) {
		this.userAddresses = userAddresses;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstname=" + firstname + ", lastname="
				+ lastname + ", email=" + email + ", phonenumber="
				+ phonenumber + ", userAddresses=" + userAddresses + "]";
	}
	
	
	
	
}
