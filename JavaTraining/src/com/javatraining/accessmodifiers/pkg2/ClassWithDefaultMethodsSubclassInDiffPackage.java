package com.javatraining.accessmodifiers.pkg2;

import com.javatraining.accessmodifiers.pkg1.ClassWithDefaultMethods;

public class ClassWithDefaultMethodsSubclassInDiffPackage extends ClassWithDefaultMethods {
	
	public void printHelloFromSuperClass(){
		//following cannot be access because default memebers cannot be access through inheritance from diff package
		//this.sayHi();
	}
	
}
