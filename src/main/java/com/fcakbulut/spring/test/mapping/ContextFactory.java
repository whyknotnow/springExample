package com.fcakbulut.spring.test.mapping;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextFactory {

	private static final ApplicationContext context = new ClassPathXmlApplicationContext(
			"com/fcakbulut/spring/test/mapping/beans.xml");

	public static ApplicationContext getContext() {
		return ContextFactory.context;
	}
	
	public void onDestroy() {

		((ClassPathXmlApplicationContext) this.context).close();
	}

}
