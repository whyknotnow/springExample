package com.fcakbulut.spring.test.human;

public class PersonFactory {

	public Person createPerson(int id, String name) {
		
		System.out.println("Person created by using PersonFactory.");
		return new Person(id, name);
	}
	
}
