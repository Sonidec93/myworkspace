package com.practice.test;

import org.junit.Assert;
import org.junit.Test;

public class TestJunit2 {


	@Test
	public void checkAge(){
		Assert.assertTrue(36>24);
	}

	@Test(expected=CustomException.class)
	public void checkException() throws CustomException{

		throw new CustomException("hell yeah");
	}
}
