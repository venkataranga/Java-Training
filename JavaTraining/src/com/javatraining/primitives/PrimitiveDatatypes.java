package com.javatraining.primitives;

public class PrimitiveDatatypes {
	
	public static void main(String[] args) {
		//in java primitive type are the only ones that are not objects in Java.
		//each primitive type has corresponding corresponding classes which are called wrapper classes
		System.out.println(Byte.MIN_VALUE+":"+Byte.MAX_VALUE);
		System.out.println(Short.MIN_VALUE+":"+Short.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE+":"+Integer.MAX_VALUE);
		System.out.println(Float.MIN_VALUE+":"+Float.MAX_VALUE);
		System.out.println(Double.MIN_VALUE+":"+Double.MAX_VALUE);
		System.out.println(Character.MIN_VALUE+":"+Character.MAX_VALUE);
		
		int i=0;
		//in the following statement variable s is of type short which can hold the subset of values an int variable can hold and hence compiler will throw an error.
		// hence if we are sure that a variable smaller size variable can hold the value of bigger size variable, then we can explicitly cast the bigger size variable to small size type 
		//this is called explicit casting
		short s = (short) i;
		
		//in the following statement, since l is a variable of type long which can hold values higher than an int can hold, compiler will 
		//implicitly conver the int to long, this is called implicit casting
		long l = i;
	}

}
