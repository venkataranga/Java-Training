package com.training.spring.aop;


public class Cal {

	public double add(double a, double b) {
		System.out.println("From add method: "+(a+b));
		return a+b;
	}
	
	@AOP
	public int add(int a, int b) {
		System.out.println("From add method: "+(a+b));
		return a+b;
	}

	@AOP
	public double minus(double a, double b) {
		System.out.println("From minus method"+(a-b));
		return a-b;
	}

	public double multiply(double a, double b) {
		System.out.println("From multiply method"+(a*b));
		return a*b;
	}

	public double divide(double a, double b) throws Exception{
		if(b==0.0)
			throw new Exception("Cannot divide by 0");
		System.out.println("From divide method"+(a/b));
		return a/b;
	}

}
