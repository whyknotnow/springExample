package com.fcakbulut.spring.test;

import java.util.List;

public class Jungle {
	private List<Animal> animals;

	private Animal theKingOne;

	public Animal getTheKingOne() {
		return theKingOne;
	}

	public void setTheKingOne(Animal theKingOne) {
		this.theKingOne = theKingOne;
	}

	public Jungle() {

	}

	public Jungle(List<Animal> animals) {
		this.animals = animals;
	}

	public List<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}

	@Override
	public String toString() {

		String str = "Jungle [animals=";
		for (Animal animal : this.animals) {
			str += animal + "\n";
		}

		str += theKingOne;

		str += "]";

		return str;
	}

}
