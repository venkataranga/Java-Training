package com.javatraining.collections;

public class Person implements Comparable<Person>{
	
	String name;
	int age;
	String gender;
	
	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public int compareTo(Person p) {
		//Person p =  (Person)o;
		//return this.name.compareToIgnoreCase(p.name);
		if(this.age > p.age)
			return 1;
		else if (this.age == p.age)
			return 0;
		else
			return -1;
	}
	
	@Override
	public String toString(){
		return this.name;
	}

	
}
