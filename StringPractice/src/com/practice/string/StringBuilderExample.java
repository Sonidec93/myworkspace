package com.practice.string;

public class StringBuilderExample {
	
	public static void main(String arg[]){
	
		System.out.println("String Builder is similar to StringBuffer it is mutable and non synchronized so it is faster");
		StringBuilder sb=new StringBuilder("mukul");

		System.out.println(sb+"mukul");

		System.out.println(sb.append(" kumra"));//appending kumra string to sb

		sb.replace(0,5,"Mukul");
		System.out.println(sb);

		sb.delete(6,11);
		System.out.println(sb);
		System.out.println(sb.delete(5,6).length());

		System.out.println(sb.reverse());

		System.out.println(sb.substring(2));
		
		System.out.println(sb.capacity());
		sb.ensureCapacity(22);
		System.out.println(sb.capacity());
	}

}
