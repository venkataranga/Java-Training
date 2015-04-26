package com.javatraining.Inheritance;

 class Main {

	public static void main(String[] args) {
		Math m = new Math();
		boolean b = m.validateUser("useR", "PWd");	
		System.out.println(b);
		if(b){
			
		}
		Car car = new Audi();
		//Audi a ;
		//a = (Audi)c;
		
		Vehicle v = new Car();//new Vehicle();
		Car c = (Car)v;
		
		v.move(45);
		
		//c.changeTemperature();
		Audi a = new Audi();
		
		printObjectName(v);
		printObjectName(c);
		printObjectName(a);
		
		Navigatable navi = new AudiA3();
		navi.getDirection(10, 11);
				
		Navigatable navi2 = new RandomClass();
		
		CreateVehicle cv = new CreateCar();
		CreateCar cc = new CreateCar();
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Car();
		cc.getCar(v1);
		cc.getCar(v2);
		//cc.pr
		Navigatable n = cc.getCar();
		//cv.getVehicle();
		
		AbstractHonda honda = new HondaAccord();
		honda.findPOI();
		
	}

	public static void printObjectName(Vehicle vehicle ){
		//vehicle.move();
		if (vehicle instanceof Car){
			Car c = (Car)vehicle;
			c.changeTemperature();
			System.out.println("Car object");
		}else if (vehicle instanceof Audi){
			Car a = (Audi)vehicle;
			System.out.println("Audi object");
		}
		System.out.println("Main.printObjectName()");
	}
}
