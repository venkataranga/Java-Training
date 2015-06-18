package com.spring.ioc.pojo;

public class Person {
	public Person(){
		
	}
	public Person(String s){
		
	}
	
	public static Person dskjhask(String sex){
		if("M".equalsIgnoreCase(sex))
			return new Male();
		else
			return new Femlae();
	}


}
