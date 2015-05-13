package com.javatraining.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrarListExample {

	public static void main(String[] args) {

		List<String> strings = new ArrayList<String>();
		strings.add("x");
		strings.add("d");
		strings.add("c");
		strings.add("f");
		strings.add("harsha");
		strings.add("harsha1");
		strings.add("venkat");

		System.out.println(strings.get(0));

		Collections.sort(strings);

		System.out.println(strings);

		System.out.println(strings.get(0));
		// in the following statement 'List' is called basetype and the 'Person'
		// inside angular braces is called generic type
		List<Person> personsList = new ArrayList<Person>();
		personsList.add(new Person("harsha", 20, "M"));
		personsList.add(new Person("venkat", 21, "M"));
		personsList.add(new Person("ravi", 23, "M"));

		Collections.sort(personsList);

		System.out.println("sorted by comparable: " + personsList);

		Collections.sort(personsList, new PersonSortingByAge());
		System.out.println("Sorted by age using comparator: " + personsList);

		Collections.sort(personsList, new PersonSortingByName());
		System.out.println("Sorted by name using comparator: " + personsList);

		Animal[] animalArray = new Animal[2];
		animalArray = new Dog[2];
		/*
		 * animalArray[0] = new Cat(); animalArray[1] = new Dog();
		 */

		// whatever the type we are specifying in the angular braces is
		// available only to the compiler and this
		// will be erased at the time of creating class files, this is called
		// type eraser.
		// List<Animal = new ArrayList<Dog>() is an invalid statement but Animal
		// [] animals = new Dog[2] is valid
		// type declared in the lefthandside angular bracket should exactly
		// match to the type inside the angular bracket on the righthandside. it
		// cannot be subtype of lefthandside
		List<Animal> animalList = new ArrayList<Animal>();
		animalList.add(new Dog());
		animalList.add(new Cat());

		animalsSpeak(animalArray);

	}

	public static void animalsSpeak(Animal[] a) {
		a[0] = new Cat();
		System.out.println(a[0]);
	}

}
