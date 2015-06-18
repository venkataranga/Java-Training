package com.spring.ioc.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.ioc.pojo.Account;
import com.spring.ioc.pojo.Person;
import com.spring.ioc.pojo.User;

public class Standalone {

	User user;
	public static void main(String[] args) {
		
		Standalone s = new Standalone();
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/ioc/config/config.xml");
		User u = (User)ctx.getBean("user");
		System.out.println(u);
		s.user = u;
		
		System.out.println(ctx.getBean("userUsingGetInstanceFactoryMethod"));
		
		//Person p = Person.getInstance("M");
//		System.out.println(ctx.getBean("person").getClass().getName());
//		System.out.println(getInstance("com.spring.ioc.pojo.Male"));
//		System.out.println(getInstance("com.spring.ioc.pojo.Femlae"));
//		System.out.println(getInstance("com.spring.ioc.pojo.User"));
//		System.out.println("____________________________");
//		System.err.println(ctx.getBean("car"));
		
		System.out.println(ctx.getBean("commonProperties"));
		System.out.println(ctx.getBean("classB"));
	
		Account a1 = (Account) ctx.getBean("accountUsingConstructorInjection");
		Account a2 = (Account) ctx.getBean("accountUsingConstructorInjection");
		System.out.println(ctx.getBean("accountUsingConstructorInjection"));
		System.out.println("a1==a2: "+(a1==a2));
		
		System.out.println(ctx.getBean("car"));
	}
	
	
	public static Object getInstance(String className){
		Object o = null;
		try {
			o= Class.forName(className).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		return o;
	}
}
