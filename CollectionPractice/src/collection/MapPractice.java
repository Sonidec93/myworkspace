package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapPractice {

	public static void main(String[] arg) {

		Map<Integer, String> map = new HashMap<Integer, String>();// Map allows
																	// unique
																	// keys only
		map.put(1, "Mukul");
		map.put(2, "Ramesh");
		map.put(3, "Ramesh");
		// map.put(null, null);// it allows multiple null values and single null
		// // key
		// map.put(null, null);
		System.out.println(map);
		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Key" + entry.getKey() + "Value"
					+ entry.getValue());
		}

		Set<Integer> keySet = new TreeSet<Integer>(map.keySet());// As Set
																	// creates
																	// unique
																	// elements
																	// only it
																	// will
																	// remove
																	// one null
		Iterator<Integer> itr = keySet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// for(int a:keySet){
		// System.out.println(a);
		// }//here what i am trying to do is I am trying to iterate over a set
		// with null value and using a non-primitive data type so internally
		// when it tries to convert null.intValue() it returns a
		// NullPointerException at runtime

		for (Integer a : keySet) {
			System.out.println(a);
		}

		Collection<String> valueSet = map.values();

		LinkedList<String> set = new LinkedList<String>(valueSet);

		System.out.println(set);

		System.out
				.println("linked hash map\n Linked hashmap maintains the insertion");

		Map<Integer, Employee> empMap = new LinkedHashMap<Integer, Employee>();// LinkedHashMap
																				// same
																				// as
																				// HashMap
																				// but
																				// maintains
																				// insertion
																				// order
		empMap.put(1, new Employee(10, "Mukul"));
		empMap.put(2, new Employee(9, "Mukul"));
		empMap.put(3, new Employee(8, "Ritesh"));

		for (Integer a : empMap.keySet()) {
			System.out.println(empMap.get(a).getEmpId());
		}

		empMap.replace(2, new Employee(7, "Pankaj"));
		empMap.remove(3, new Employee(8, "Ritesh"));

		for (Integer a : empMap.keySet()) {
			System.out.println(empMap.get(a).getEmpId());
		}

		System.out.println("--Tree Map--");// Treemap stores according to
											// ascending order of the keys.It
											// cannot have null key but can have
											// multiple null values

		TreeMap<Integer, Employee> treeMap = new TreeMap<Integer, Employee>();

		treeMap.put(102, new Employee(10, "Mukul"));
		treeMap.put(101, new Employee(11, "Minkel"));
		treeMap.put(100, new Employee(8, "Rajesh"));
		//treeMap.put(100, null);

		for (Entry<Integer, Employee> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey() + " "
					+ entry.getValue().getEmpName());
		}

		System.out.println("checking if a specific key is present or not: "
				+ treeMap.containsKey(101));

		System.out.println("checking if a employee rajesh exists or not: "
				+ treeMap.containsValue(new Employee(8, "Rajesh")));

		System.out.println("fectching the first key and last:"
				+ treeMap.firstKey() + " " + treeMap.lastKey());

		System.out
				.println("fetching the first & last entry "
						+ treeMap.firstEntry().getKey()
						+ treeMap.firstEntry().getValue().getEmpName()
						+ "\nLast Entry "
						+ treeMap.lastEntry().getValue().getEmpName());
		
		Hashtable<Integer,String> hashtable=new Hashtable<Integer, String>();
		//HashTable inherits the disctionary class and does not allow any null key or null value
		//It is synchronized while HashMap is non-synchronized
		hashtable.put(1, "Meenakshi");
		hashtable.put(2,"Kiran");
		hashtable.put(3, "Gopal");
		hashtable.put(4, "Kiran");
		hashtable.put(1,"Meenakshi");
		for(Entry<Integer,String> entry:hashtable.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}
}
