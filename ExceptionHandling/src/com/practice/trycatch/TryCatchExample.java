package com.practice.trycatch;

import java.io.IOException;

public class TryCatchExample {

	
	public static void m() throws CustomException{

		throw new CustomException("Example of throws keyword");//the checked exception are not forwarded in call chain
	}//so to make this possible we have to use throws keyword

	public static void main(String [] arg){


		try{
			int a[]=new int[5];

			a[4]=10;
			System.out.println(a);
			m();

			try{
				throw new IOException("just throwing custom exception");
			}
			finally{
				System.out.println("hi there");
			}
		}
		catch(ArithmeticException e){

			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
