package com.practice.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListExample {

	public static void main(String[] arg) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("mukul");
		list.add("sukhman");
		list.add("mahesh");

		List<String> list2 = new ArrayList<String>();
		list2.add("manu");
		
		System.out.println(list.lastIndexOf("mukul"));
		Collections.sort(list);

		System.out.println("----cloning object----clone function not present in list interface--");
		@SuppressWarnings("unchecked")
		List<String> cloneList=(List<String>) list.clone();

		System.out.println(cloneList);
		for (String string : list) {
			System.out.println(string);
		}

		list.trimToSize();
		list.add("kk");
		list.addAll(list2);
		System.out.println("---Iterating using iterator---");

		ListIterator<String> itr = list.listIterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

		System.out.println("--iterating from back----");

		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}



		System.out.println("------LinkedList--------");

		LinkedList<String> ll=new LinkedList<String>();

		ll.add("mukul");
		ll.add("vishal");
		ll.add("Abhishek");

		Collections.sort(ll);

		ll.addFirst("mahesh");
		ListIterator<String> itr2=ll.listIterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}

		System.out.println("--getting first and last---");

		System.out.println("First:"+ll.getFirst());
		System.out.println("Last:"+ll.getLast());
		System.out.println("----Adding first and Adding last--");

		ll.addFirst("naman");
		ll.addLast("yogesh");

		System.out.println(ll);

	}

}
