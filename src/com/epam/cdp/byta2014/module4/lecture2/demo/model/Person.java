package com.epam.cdp.byta2014.module4.lecture2.demo.model;

public class Person {

	protected String firstName;
	protected String secondName;
	
	public Person(String firstName, String secondName) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	
	public String getInfo() {
		return "First Name: " + getFirstName() + ", Last Name: " + getSecondName() + "\n";
	}

}
