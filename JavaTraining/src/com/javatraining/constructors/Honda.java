package com.javatraining.constructors;

public class Honda extends Car {

	@Override
	public String toString() {
		return "Honda [hondaSubType=" + hondaSubType + ", type=" + type
				+ ", maxSpeed=" + maxSpeed + ", color=" + color + "]";
	}

	String hondaSubType;
	
	public Honda(){
		super();
		//super("topless", 250, "silver");
		System.out.println("Honda class constructor");
		hondaSubType = "Accord";
	}
	
	
}
