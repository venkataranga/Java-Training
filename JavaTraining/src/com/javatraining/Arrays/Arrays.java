package com.javatraining.Arrays;

import javax.swing.text.html.HTML;

public class Arrays {

	public static void main(String[] args) {
	
		//local variable are declared inside a method and should be initialized before use. null is a proper value that can be assigned to local variables 
		Car c = null;
		System.out.println(c);
		System.out.println("args size: " + args.length);
		
		//declaring array reference variable which holds array of integers
		int[] intArray;
		//initializing the array to hold 10 integer values
		// we can declare and initialize the array in the same step: int[] intArray = new int[10];
		//size of the array cannot be changed after initializing
		intArray = new int[10];

		//another way of declaring arrays.
		//length of the array is inferred from the right hand side of expression
		int[] anotherWayOfDeclaringArray = { 
												12, 
												542, 
												433, 
												7654, 
												65, 
												12 
											};

		//arrays index starts from 0.
		//to access the array at index i, <<arrayName>>[<<index>>]
		System.out.println(anotherWayOfDeclaringArray[0]);
		System.out.println(anotherWayOfDeclaringArray[1]);
		System.out.println(anotherWayOfDeclaringArray[2]);
		System.out.println(anotherWayOfDeclaringArray[3]);
		System.out.println(anotherWayOfDeclaringArray[4]);

		anotherWayOfDeclaringArray[1] = 20;
		// anotherWayOfDeclaringArray[6] = 20;

		//Multidimensional array is an array of arrays. that means each element at a index is again an array itself. we can declare multidimensional array of any dimensions 
		//if we don't specify the size at second square brace, then we can initialize the inner arrays with different sizes as shown in below example
		//if we declare int[][] mutliDarray = new int[3][2]; then each array at index 0,1,2 will be an array of size 2
		int[][] multiDArray = new int[3][];
		multiDArray[0] = new int[10];
		multiDArray[1] = new int[2];

		multiDArray[0][0] = 1;
		multiDArray[0][1] = 1;
		multiDArray[0][2] = 1;
		multiDArray[0][3] = 1;
		multiDArray[0][4] = 1;
		multiDArray[0][5] = 1;
		multiDArray[0][6] = 1;

		multiDArray[1][0] = 1;
		multiDArray[1][0] = 1;

		//another way of declaring multidimensional arrays.
		//length of the array is inferred from the right hand side of expression
		int[][] anotherWayOfDeclaring2DArray = {
												{ 10, 20 }, 
												{ 30 },
												{ 40, 50, 60 }, 
												{ 70, 80 } 
											};

		System.out.println("value after changing: "
				+ anotherWayOfDeclaringArray[1]);

		printArraySize(intArray);

		
		//declaring array that can store 10 instance of Car class (i.e.., Car objects)
		Car[] carArray;
		carArray= new Car[10];
		System.out.println("carArray length: "+carArray.length);
		for(Car car : carArray){
			System.out.println(car);
		}
		int anotherIntArray[] = new int[10];
		for(int i : anotherIntArray){
			System.out.println(i);
		}

		Car c1 = new Car();
		System.out.println("Gear from c1: "+c1.currentGear);
		c1.currentGear=1;
		System.out.println("Gear from c1: "+c1.currentGear);
		
		Car c2 = new Car();
		System.out.println("Gear from c2: "+c2.currentGear);
		c2.currentGear=2;
		
		carArray[0] = c1;
		carArray[1] = c2;
		
		int[] localCarIntArray = c1.carIntArray;
		
		System.out.println(carArray[0].currentGear=1);
		System.out.println("Gear from c1: "+c1.currentGear);
		
		//when we assign on reference variable to another reference variable, then these two variable points to the same object in the memory. that is changing value with any reference 
		//variable after this assignment, will change the same memory location
		c2 = c1;
		
		//null is also a value and it mean that object reference is not pointing to any object in the memory
		c2 =null;
		c2.currentGear=3;
		System.out.println("Gear from c1: "+c1.currentGear);

	}

	public static void printArraySize(int[] array) {
		//every array will have a length property that contains the lenght of the array
		System.out.println(array.length);
	}
}
