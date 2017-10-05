package com.fcakbulut.spring.test;

public class Address {
	private String street;
	private int doorNumber;

	public void init() {
		System.out.println("Bean created:" + this);
	}
	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", doorNumber=" + doorNumber + "]";
	}

}
