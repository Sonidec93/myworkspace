package com.practice.Enumset;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Set;
import java.util.Map.Entry;

public class EnumSetExample {

	public static void main(String arg[]) {

		Set<Days> set = EnumSet.of(Days.FRIDAY, Days.MONDAY);

		for (Days obj : set) {
			System.out.println(obj);

		}

		Set<Days> set2 = EnumSet.allOf(Days.class);

		for (Days obj : set2) {
			System.out.println(obj);
		}

		Set<Days> set3 = EnumSet.noneOf(Days.class);

		for (Days obj : set3) {
			System.out.println(obj);
		}

		EnumMap<Days, String> enumMap = new EnumMap<Days, String>(Days.class);

		enumMap.put(Days.MONDAY, "Difficult day");
		System.out.println("Displaying the Days");
		for (Entry<Days, String> entry : enumMap.entrySet()) {
			System.out.println(entry.getKey() + " means a " + entry.getValue());
		}

		set3 = EnumSet.range(Days.MONDAY, Days.FRIDAY);
		System.out.println(set3);

	}
}
