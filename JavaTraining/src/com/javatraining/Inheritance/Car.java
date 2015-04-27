package com.javatraining.Inheritance;

public class Car extends Vehicle {
	
	String color = "white";
	
	public void changeTemperature(){
		
	}
	
	@Override
	public void move(int spd){
		getCarColor();
		super.move(spd);
		System.out.println("Car is moving at seepd:"+spd);
		//super.move();
	}
	
	private void getCarColor(){
		System.out.println("Car Color is: "+color);
	}
}
