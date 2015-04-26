package com.javatraining.Inheritance;

public class Car extends Vehicle {
	
	String color = "white";
	
	public void changeTemperature(){
		
	}
	
	@Override
	public void move(int spd){
		super.move(spd);
		System.out.println("Car is moving at seepd:"+spd);
		//super.move();
	}
}
