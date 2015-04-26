package com.javatraining.firstproject.standalone.examples;

public class ClassExample {

	static int staticVarible =0; 
	
	int anIntegerVariable;
	String name="default";


	public void sayHi(){
		System.out.println("Hey, "+name + staticVarible);
	}

	
	public void add(ClassExample e){
		e.anIntegerVariable = 20;
		e.name="";
	}
}

