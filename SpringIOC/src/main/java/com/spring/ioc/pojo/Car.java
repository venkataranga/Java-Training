package com.spring.ioc.pojo;

public class Car {

	String make;
	String model;
	Person p;
	

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", p=" + p + "]";
	}


	public Car(String make, String model, Person p) {
		super();
		this.make = make;
		this.model = model;
		this.p = p;
	}
	
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Person getP() {
		return p;
	}
	public void setP(Person p) {
		this.p = p;
	}
	
}
