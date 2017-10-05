package com.fcakbulut.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/fcakbulut/spring/test/beans/beans.xml");

		Person person1 = (Person) context.getBean("person");

		person1.speak();
		System.out.println(person1.toString());

		((ClassPathXmlApplicationContext) context).close();
	}

}
