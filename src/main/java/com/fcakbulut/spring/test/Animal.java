package com.fcakbulut.spring.test;

public class Animal {
	private String animalName;

	public Animal() {

	}

	public Animal(String animalName) {
		super();
		this.animalName = animalName;
	}

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	@Override
	public String toString() {
		return "Animal [animalName=" + animalName + "]";
	}

}
