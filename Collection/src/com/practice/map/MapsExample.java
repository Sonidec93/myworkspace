package com.practice.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapsExample {


	public static void main(String arg[])
	{

		Map<Integer,String> mp=new HashMap<Integer, String>();
		System.out.println("Map interface doesnt have containsValue() and values function");
		mp.put(1,"mukul");

		mp.put(2,"vishsal");

		System.out.println("--iterating map using iterator----");

		Iterator<Entry<Integer, String>> itr=mp.entrySet().iterator();

		while(itr.hasNext())
		{
			Entry<Integer, String> entry=itr.next();
			System.out.println("Key: "+entry.getKey()+" ,Value :"+entry.getValue());

		}

		System.out.println("iterating using for each loop--");

		for(Entry<Integer,String> entry:mp.entrySet()){

			System.out.println(entry.getValue());
			System.out.println(entry.getKey());
		}
		System.out.println("--using values()--");
		Collection<String> col=mp.values();
		System.out.println(col);


		System.out.println("----LinkedHashMap has same function and it maintains the insertion order can contain one null key an multiple null values--");

		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer, String>();

		lhm.put(1,"Mina");
		lhm.put(2, "kirti");
		lhm.put(null,null);
		lhm.put(null,null);

		lhm.put(1,"Mona");
		for(Entry<Integer,String> entry:lhm.entrySet())
		{
			System.out.println("Key:"+entry.getKey()+" ,Value:"+entry.getValue());

		}
		System.out.println("---TreeMap---it maintains ascending order---cannot have null key but can have multiple null values");

		TreeMap<Integer,String> tree=new TreeMap<Integer, String>();
		tree.put(102,"mkulu");
		tree.put(101,"yadav");

		for(Entry<Integer,String> entry:tree.entrySet())
		{
			System.out.println(entry.getKey()+" "+ entry.getValue());
		}

		System.out.println("first key");
		System.out.println(tree.firstKey());

		System.out.println("Lastkey");
		System.out.println(tree.lastKey());
		System.out.println("HasTable does not contain any null key or nul value");
		Map<Integer,String> htm=new Hashtable<Integer, String>();
		
		htm.put(1,"Mukul");
		htm.put(2,"Suresh");
	
		
		for(Entry<Integer,String> entry:htm.entrySet()){
			
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		

	}


}

