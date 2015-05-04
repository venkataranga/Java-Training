package com.javatraining.constructors;

public class Car {
	
	String type;
	int maxSpeed;
	String color;
	
/*	public Car(){
		System.out.println("Car class constructor");
		this.type = "coupe";
		this.maxSpeed = 160;
		this.color = "white";
	}
	
	public Car(String type, int maxSeep, String color){
		this.type = type;
		this.maxSpeed = maxSeep;
		this.color = color;
	}*/
	public static void main(String[] args) {
		Car c = new Car();//("sedan", 200, "red");
		System.out.println(c.color);
		System.out.println(c.maxSpeed);
		System.out.println(c.type);
	}

	public  static Car getCarInstance(){
		return new Car();//("sedan",200,"blue");
	}
}
