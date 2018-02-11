package com.example.collections;

import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class EnumSetEnumMapExample {

	public enum days {
		Monday, Tuesday, Wednesday, Thursday, Friday
	}

	public static void main(String[] arg) {

		EnumSet<days> daysSet = EnumSet.allOf(days.class);

		for (days d : daysSet) {
			System.out.println(d);
		}
		System.out.println(days.Friday);

		EnumMap<days, String> enumMap = new EnumMap<EnumSetEnumMapExample.days, String>(
				days.class);
		enumMap.put(days.Friday, "Fun day");

		Collection<String> values = new HashSet<String>(enumMap.values());

		values.removeAll(values);
		System.out.println(values.isEmpty());
		Iterator<Entry<days, String>> itr = enumMap.entrySet().iterator();

		while (itr.hasNext()) {
			Entry<days, String> entry = itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
