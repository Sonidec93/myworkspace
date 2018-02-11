package com.practice.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestExample {


	//@Ignore
	@Test(timeout=30000)
	public void test(){

		Assert.fail();
		//there are many methods like asserTrue,assertFalse,assertFail,assertNotNull,assertNull,assertEquals
	}

	public static void main(String[] args) {

		Result result=JUnitCore.runClasses(TestExample.class);

		for(Failure failure :result.getFailures())
		{
			System.out.println(failure.toString());
		}



	}
}
