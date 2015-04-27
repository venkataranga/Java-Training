package com.javatraining.accessmodifiers.pkg2;

import com.javatraining.accessmodifiers.pkg1.ClassWithProtectedMembers;

public class ClassWithProtectedMethodsSubclassInDiffPackage extends
		ClassWithProtectedMembers {

	public void sayHiFromSuperClass() {
		//Protected 
		this.sayHi();
		ClassWithProtectedMembers p = new ClassWithProtectedMembers();
		//p.sayHi();

	}
}
