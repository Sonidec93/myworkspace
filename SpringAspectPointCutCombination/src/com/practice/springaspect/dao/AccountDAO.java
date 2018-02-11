package com.practice.springaspect.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	public void throwigException()  {

		System.out.println("Inside throwing exception");
		int a=1/0;
//		throw new Exception("Error occured");
	}
}
