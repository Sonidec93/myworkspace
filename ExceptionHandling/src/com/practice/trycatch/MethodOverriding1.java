package com.practice.trycatch;

import java.io.IOException;

class Overriding1{

	public void method1() throws Exception{

		System.out.println("parent class not throing any exception");
	}
}


public class MethodOverriding1 extends Overriding1{
	
	public void method1() throws IOException {
		
		throw new IOException("The subclass method can throw no exception sam exception but not parent exception");
	}

}
