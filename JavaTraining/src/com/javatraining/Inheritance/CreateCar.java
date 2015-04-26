package com.javatraining.Inheritance;

import java.io.IOException;

public class CreateCar extends CreateVehicle {

	@Override
	public Car getVehicle() {
		return new Car();
	}
	
	public Car getCar(Vehicle v){
		System.out.println("Vehicle version of getCar is called: "+v.getClass().getSimpleName());
		return new Car();
	}
	public Car getCar(String color){
		Car c = new Car();
		c.color=color;
		return c;
	}
	public Car getCar(Car c) {
		System.out.println("Car version of getCar is called");
		Car c1 = new Car();
		//c.color=color;
		return c1;
	}
	public Navigatable getCar() {
		System.out.println("Car version of getCar is called");
		Car c1 = new Car();
		//c.color=color;
		return new AudiA3();
	}
	private void privateMethod(){
		System.out.println("this is from createCar private method");
	}
	
}
