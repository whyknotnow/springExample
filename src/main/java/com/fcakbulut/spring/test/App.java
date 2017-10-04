package com.fcakbulut.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/fcakbulut/spring/test/beans/beans.xml");
		
		Person person = (Person)context.getBean("person");
		person.speak();
		
		System.out.println(person.toString());
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
