package com.fcakbulut.spring.test;

public class Person {

	private int id;
	private String name;

	private int taxId;

	private Address address;

	public Person() {

	}

	public Person(int id, String name) {
		this.setId(id);
		this.setName(name);
	}

	public void speak() {
		System.out.println("Hello! I'm a person.");
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + ", address=" + address.toString() + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTaxId() {
		return taxId;
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
