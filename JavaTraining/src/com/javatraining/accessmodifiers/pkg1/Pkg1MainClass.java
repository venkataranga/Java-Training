package com.javatraining.accessmodifiers.pkg1;

public class Pkg1MainClass {

	public static void main(String[] args) {
		ClassWithDefaultMethods c = new ClassWithDefaultMethods();
		c.sayHi();
		ClassWithProtectedMembers p = new ClassWithProtectedMembers();
		p.sayHi();
	}
}
