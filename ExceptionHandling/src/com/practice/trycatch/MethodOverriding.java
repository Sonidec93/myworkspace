package com.practice.trycatch;




class Overriding{

	public void method1(){

		System.out.println("parent class not throing any exception");
	}
}

public class MethodOverriding extends Overriding{

	public void method1() throws ArithmeticException{//can throw checked exception not unchecked

		throw new ArithmeticException("hello ");
	}

	public static void main(String arg[]){
		MethodOverriding obj=new MethodOverriding();
		obj.method1();
	}
}
