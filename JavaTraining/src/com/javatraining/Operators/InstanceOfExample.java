package com.javatraining.Operators;

import java.io.Serializable;

import com.javatraining.Arrays.Car;
public class InstanceOfExample extends Car implements Serializable {

	public static void main(String[] args) {
		
		InstanceOfExample e1 = new InstanceOfExample();
		//InstanceOfExample e2 = new InstanceOfExample();

		System.out.println(e1 instanceof InstanceOfExample);
		System.out.println(new Car() instanceof Object);
		System.out.println(e1 instanceof Serializable);
		System.out.println(e1 instanceof Car);
		
	}
	
}
