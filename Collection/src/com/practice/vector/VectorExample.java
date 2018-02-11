package com.practice.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String arg[]){

		Vector<String> vector=new Vector<String>();
		//Vector is synchronized so it is slow 
		vector.add("mukul");
		vector.addElement("sukhu");

		System.out.println("-----Traversing vector using Enumeration---");

		Enumeration<String> en=vector.elements();
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());

		}
		Iterator<String> itr=vector.iterator();

		System.out.println("-----Traversing vector using iterator----");

		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}

