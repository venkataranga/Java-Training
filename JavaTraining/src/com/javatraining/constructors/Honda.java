package com.javatraining.constructors;

public class Honda extends Car {
	//System.out.println("from instance initialization block");

	static{
		System.out.println("from static initialization block");
	}
	{
		System.out.println("from instance initialization block1");
	}
	{
		System.out.println("from instance initialization block2");
	}
	{
		System.out.println("from instance initialization block3");
	}
	@Override
	public String toString() {
		return "Honda [hondaSubType=" + hondaSubType + ", type=" + type
				+ ", maxSpeed=" + maxSpeed + ", color=" + color + "]";
	}

	public static String getString(){
		return "hi";
	}
    String hondaSubType;
    int maxSpeed;
	
	public Honda(){
		//super(hon);
		super(getString(), 250, "silver");
		System.out.println("Honda class no args constructor");
		hondaSubType = "Accord";
		maxSpeed = 180;
		
		
	}
	public Honda(String hondaSubtype){
		this();
		this.hondaSubType = hondaSubtype;
	}
	public Honda(String hondaSubtype, int maxSpeed){
		//this();
		this.hondaSubType = hondaSubtype;
		this.maxSpeed = maxSpeed;
	}
	
	
}
