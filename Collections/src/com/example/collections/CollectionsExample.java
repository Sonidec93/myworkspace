package com.example.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class CollectionsExample {

	public static void main(String [] arg)
	{
		
		List<String> mylist=new ArrayList<String>();
		
		mylist.add("mukul");
		mylist.add("sukhman");
		mylist.add("Aman");
		
		Collections.sort(mylist);
		
		ListIterator<String> itr=mylist.listIterator();
		
		while(itr.hasNext());
		{
			
			System.out.println("hello");
		}
		
	}
	
}