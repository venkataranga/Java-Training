package com.training.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Standalone {

	public static void main(String[] args) throws Exception {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Cal c = (Cal) context.getBean("cal");
		c.add(1,2);
		c.minus(1, 1);
		double result = c.divide(1, 1);
	}
	
}
