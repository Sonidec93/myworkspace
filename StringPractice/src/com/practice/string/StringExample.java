package com.practice.string;

public class StringExample {

	public static void main(String [] arg){

		String name=new String("Mukul123");
StringBuffer sbf =new StringBuffer("Mukul");
		char [] array=new char[10];

		name.getChars(0,name.length(),array,0);
System.out.println(name.equals(sbf));
		System.out.println(array);
System.out.println(name.matches(".*\\d{3}"));
		byte[] byteArray=name.getBytes();

		for(byte a:byteArray){

			System.out.println(a);
		}

		name.replace('u','U');

		System.out.println(name);

		name=name.replaceAll("uk","UK");
		System.out.println(name);

		String string=new String(array);

		System.out.println(string+" length :"+string.length());

		System.out.println("triming the leading and trailing white spaces of string");
		string=string.trim();
		System.out.println(string.trim()+"length :"+string.length());

		System.out.println("--fetching the index of first and last index of character u");

		System.out.println("first index :"+string.indexOf('u')+" last index:"+string.lastIndexOf('u'));
		string=string.concat(" you are awesome");

		System.out.println("----After concatenating---");
		System.out.println(string);

		String [] splitArray=string.split("\\s");
		System.out.println("---After spliting--");
		for (int i = 0; i < splitArray.length; i++) {
			System.out.println(splitArray[i]);
		}

		String substr=string.substring(0,5);
		System.out.println("Creating a substring : "+substr);
		
		System.out.println("Displaying character at a particular index:"+substr.charAt(2));
		substr=substr.concat("_");

		System.out.println("using matches to match the string according to the specific regex");
		System.out.println(substr.matches("\\w*"));//word character

		System.out.println(substr);
		substr=substr.substring(0,5);
		System.out.println("joining the string using join() method");

		System.out.println(String.join("-",substr,"kumra"));
		System.out.println(substr.intern());
		
	}

}
