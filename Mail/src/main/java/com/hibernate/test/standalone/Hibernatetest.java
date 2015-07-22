package com.hibernate.test.standalone;

import java.util.Properties;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.hibernate.test.pojo.Address;
import com.hibernate.test.pojo.Person;



public class Hibernatetest {

	public static void main(String[] args) {
		
		Configuration c = new Configuration();
		c.addAnnotatedClass(Person.class);
		c.addAnnotatedClass(Address.class);
		Properties p = new Properties();
		p.put("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
		p.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/JDBCTraining");
		p.put("hibernate.connection.username","root"	);
		p.put("hibernate.connection.password"	, "dinesh");
		p.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		p.put("show_sql", true);
		
		SessionFactory sf = c.buildSessionFactory(new StandardServiceRegistryBuilder().applySettings(p).build());
		/*System.out.println(sf);
		System.out.println(sf.openSession().createQuery("from Person").list());
	
		Person person = new Person();
		person.setFirstname("student");
		person.setLastname("stu");
		person.setEmail("gmail.com");
		person.setPhonenumber("1234567");
		
		Address address = new Address();
		address.setHouseno("32");
		address.setStreet("dawda");
		address.setCity("dasdd");
		address.setState("fsd");
		address.setCountry("US");
		address.setType("houe");
		
		
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		session.save(person);
		address.setPerson(person);
		session.save(address);
		t.commit();
		//session.flush();
		session.close();
		sf.close();*/
		
		//HQL
		//SQL
		//Criteria
		//NamedQueries
		Session session = sf.openSession();
		//Query hqlQuery = session.createQuery("from Person p where p.email= :email");
		//hqlQuery.setString("email", "gmail.com");
		//System.out.println(hqlQuery.list());
		
		
		Criteria c1 = session.createCriteria(Person.class);
		c1.add(Restrictions.like("email", "gmail%"));
		System.out.println(c1.list());
		
		System.out.println("From named query: "+session.getNamedQuery("namedQuery").list());;
		
		session.close();
		sf.close();
	}
	
}
