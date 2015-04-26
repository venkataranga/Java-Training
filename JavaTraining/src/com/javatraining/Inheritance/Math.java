package com.javatraining.Inheritance;

public class Math {
	public void add(int a, int b){
		System.out.println(a+b);
	}
	public void minus(int a, int b){
		System.out.println(a-b);
	}

	public void sayHelloWorld(){
		System.out.println("Hello World");
	}
	
	public boolean validateUser(String username, String password){
		System.out.println(username);
		System.out.println(password);
		return true;
	}
}
