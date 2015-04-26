package com.javatraining.Arrays;

public class Car {

	//instance variable are declared inside class but outside of any method and without static keyword. these are also called state, fields, non-static fields 
	int currentGear = 0;
	//static variable are declared inside class but outside of any method and without static keyword. these are also called state, static-fields
	static int maxSpeed;
	int[] carIntArray;
	
	public  void increaseGear(){
		currentGear++;
	}
	public void decreaseGear(){
		currentGear--;
	}
	
	
}
