package com.javatraining.innerclasses;

public class AnnonymousInnerClassExample {

	int i;

	public void callAnimalsSpeakMethod(Animal a) {
		a.speak();
		

	}

	public static void main(String[] args) {

		// Animal animal = new Animal();
		AnnonymousInnerClassExample anny = new AnnonymousInnerClassExample();
	
		anny.callAnimalsSpeakMethod(new Animal() {
			public void speak() {
				System.out.println("Speaking from annonymous class");
			}
		});
		
		anny.callBarkMethod(new Barkable() {
			
			@Override
			public void bark() {
				// TODO Auto-generated method stub
				
			}
		});
		
		//anny.callBarkMethod();
		
		Barkable bk = new Barkable() {
			
			@Override
			public void bark() {
				System.out.println("annonymous inner class is barking");
			}
		};

	}
	
	
	public void callBarkMethod(Barkable b){
		b.bark();
	}
}
