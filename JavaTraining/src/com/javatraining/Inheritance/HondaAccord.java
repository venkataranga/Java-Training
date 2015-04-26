package com.javatraining.Inheritance;

public class HondaAccord  extends AbstractHonda {

	/*@Override
	public void findPOI(){
		//super.findPOI();
		System.out.println("findPOI from Honda Accord");
	}*/
	final int i =10;
	final Car c = new Car();
	
	@Override
	public void changeVolume() {
		c.color="red";
		System.out.println("Changing volume");

	}
	@Override
	public void getDirection(long lat, long lng) {
		// TODO Auto-generated method stub

	}
	@Override
	public void pickUp() {
		// TODO Auto-generated method stub
		
	}
}
