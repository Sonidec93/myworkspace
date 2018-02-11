package com.practice.string;


public class StringBufferExample {

	public static void main(String arg[]){

		StringBuffer sb=new StringBuffer("mukul");//String Buffer is synchronized i.e multiple threads can access it simultaneously

		System.out.println(sb+"mukul");

		System.out.println(sb.append(" kumra"));//appending kumra string to sb

		sb.replace(0,5,"Mukul");
		System.out.println(sb);

		sb.delete(6,11);
		System.out.println("After deletion"+sb);
		System.out.println(sb.delete(5,6).length());

		System.out.println(sb.reverse());

		System.out.println(sb.substring(2));

		System.out.println(sb.capacity());
		sb.ensureCapacity(22);
		System.out.println(sb.capacity());
		




	}

}
