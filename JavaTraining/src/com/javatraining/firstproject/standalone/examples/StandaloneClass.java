package com.javatraining.firstproject.standalone.examples;

import com.javatraining.Inheritance.Car;

public class StandaloneClass extends Car {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.applyBreak();
		int a; 
		
		a = 10;
		System.out.println(a);
		ClassExample firstJavaClass;
		firstJavaClass = new ClassExample();
		System.out.println(firstJavaClass.name);
		firstJavaClass.anIntegerVariable = 10;
		firstJavaClass.name = "Venkat";
		
		
		System.out.println(firstJavaClass.anIntegerVariable);
		
		firstJavaClass.sayHi();
		firstJavaClass.add(firstJavaClass);
		System.out.println(firstJavaClass.staticVarible);
		ClassExample.staticVarible = 10;
		
		
		
		ClassExample secondJavaClass = new ClassExample();
		secondJavaClass.anIntegerVariable = 20;
		secondJavaClass.name="dinesh";
		
		System.out.println(secondJavaClass.anIntegerVariable);
		secondJavaClass.sayHi();
		System.out.println(ClassExample.staticVarible);
		
	}

}
