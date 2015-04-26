package com.javatraining.Inheritance;

import java.io.Serializable;


public abstract class AbstractHonda implements Navigatable, Serializable, V6{

	@Override
	public final void findPOI(){
		System.out.println("findPOI from abstractHonda");
	}
	
/*	@Override
	public void getDirection(long lat, long lng){
		
	}*/
	public abstract void changeVolume();
}
