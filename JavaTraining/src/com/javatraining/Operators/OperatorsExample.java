package com.javatraining.Operators;

public class OperatorsExample {

	public static void main(String[] args) {
		int i=44;
		if(i==0){
			System.out.println("in ifloop: "+0);
		}else if(i==1){
			System.out.println("in ifloop: "+1);
		}else if(i==2){
			System.out.println("in ifloop: "+2);
		}else if(i==3){
			System.out.println("in ifloop: "+3);
		}
		String name = "dinesh1";
		switch(name){
			case "venkat":
				System.out.println("in switch: "+19);
				break;
			case "Harsha":
				System.out.println("in switch: "+21);
				break;
			case "dinesh":
				System.out.println("in switch: "+44);
				//break;
			
				System.out.println("in switch: "+66);
				break;
			default:
				System.out.println("in default case");
		}
		//System.out.println(i);
	}
	
}
