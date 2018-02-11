package com.projects.first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;


public class First {

	public static void main(String [] arg)
	{
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("mukul");
		list.add("sukhman");
		list.add("mahesh");
		
		List<String> list2=new ArrayList<String>();
		list2.add("mukul");
		
		Collections.sort(list);
		
		for (String string : list) {
			System.out.println(string);
		}
		list.removeAll(list2);
		System.out.println("---Iterating using iterator---");
		
	ListIterator<String> itr=list.listIterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
		
	}
	}
	
}
