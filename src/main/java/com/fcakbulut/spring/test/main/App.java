package com.fcakbulut.spring.test.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fcakbulut.spring.test.jungle.Jungle;
import com.fcakbulut.spring.test.mapping.ContextFactory;

public class App {

	public static void main(String[] args) {
		// ApplicationContext beanContext = new
		// ClassPathXmlApplicationContext("com/fcakbulut/spring/test/mapping/beans.xml");

		ApplicationContext beanContext = ContextFactory.getContext();

		// Person person1 = (Person) context.getBean("person");
		//
		// person1.speak();
		// System.out.println(person1.toString());
		//
		// FruitBasket fruitBasket = (FruitBasket) context.getBean("fruitBasket");
		// System.out.println(fruitBasket.toString());

		Jungle jungle = (Jungle) beanContext.getBean("jungle");

		System.out.println(jungle);
	}

}
