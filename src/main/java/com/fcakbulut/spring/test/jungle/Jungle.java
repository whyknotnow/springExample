package com.fcakbulut.spring.test.jungle;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Jungle {
	private List<Animal> animals;

	private Animal theKingOne;

	private Map<String, String> foods;

	public Map<String, String> getFoods() {
		return foods;
	}

	public void setFoods(Map<String, String> foods) {
		this.foods = foods;
	}

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

		str += "[Foods=";

		for (Entry<String, String> food : foods.entrySet()) {
			str += food.getValue() + "-" + food.getKey() + "\n";
		}

		str += "]";
		return str;
	}

}
