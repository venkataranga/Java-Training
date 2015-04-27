package com.javatraining.accessmodifiers.pkg2;

import com.javatraining.accessmodifiers.pkg1.ClassWithDefaultMethods;
import com.javatraining.accessmodifiers.pkg1.ClassWithProtectedMembers;

public class Pkg2MainClass {

	public static void main(String[] args) {
		ClassWithDefaultMethods c = new ClassWithDefaultMethods();
		//following statement will not work because ClassWithDefaultMethod and Pkg2Main class are in diff packages
		// and sayHi has default acces
		//c.sayHi();
		ClassWithProtectedMembers p = new ClassWithProtectedMembers();
		//p.sayHi();
		
		ClassWithProtectedMethodsSubclassInDiffPackage pp = new ClassWithProtectedMethodsSubclassInDiffPackage();
		//pp.sayHi();
	}
	
}
