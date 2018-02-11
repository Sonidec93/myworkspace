package com.practice.springaspect.dao;

import org.springframework.stereotype.Component;

@Component
public class Account {

	private String firstName;
	private String lastName;

	public void Details() {
		System.out.println("fetching details");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
