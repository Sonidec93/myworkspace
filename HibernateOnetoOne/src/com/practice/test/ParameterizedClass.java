package com.practice.test;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class ParameterizedClass {

	private int age1;
	private int age2;


	public ParameterizedClass(int age1,int age2){
		this.age1=age1;
		this.age2=age2;

	}

	@Parameterized.Parameters
	public static Collection ageComparison(){

		return Arrays.asList(new Object [][]{
				{3,5},{5,6},{16,15}
		});
	}

	@Test
	public void checkAge(){

		Assert.assertTrue(age1>age2);
	}

}
