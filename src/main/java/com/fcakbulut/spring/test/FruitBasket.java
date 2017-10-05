package com.fcakbulut.spring.test;

import java.util.List;

public class FruitBasket {

	public List<String> fruits;

	public FruitBasket() {

	}

	public FruitBasket(List<String> fruits) {
		this.fruits = fruits;
	}

	public List<String> getFruits() {
		return fruits;
	}

	public void setFruits(List<String> fruits) {
		this.fruits = fruits;
	}

	@Override
	public String toString() {

		String fruitBasketStr = "FruitBasket [fruits=";
		for (String fruit : fruits) {
			fruitBasketStr += fruit + "\n";
		}

		fruitBasketStr += "]";

		return fruitBasketStr;

	}

}
