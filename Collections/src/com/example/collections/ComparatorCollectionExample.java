package com.example.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Student implements Comparable<Student> {

	private int age;
	private String name;

	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Student arg0) {
		// TODO Auto-generated method stub
		return this.name.compareTo(arg0.getName());
	}

}

class AgeComparator implements Comparator<Student> {

	@Override
	public int compare(Student arg0, Student arg1) {
		if (arg0.getAge() > arg1.getAge())
			return 1;
		else if (arg0.getAge() < arg1.getAge())
			return -1;
		else
			return 0;
	}

}

public class ComparatorCollectionExample {

	public static void main(String arg[]) {
		// Collection class provide us various methods to manipulate the
		// collection type

		List<Student> studentList = new LinkedList<Student>();
		studentList.add(new Student(12, "Mukul"));
		studentList.add(new Student(10, "Mona"));
		studentList.add(new Student(9, "Rahul"));
		studentList.add(new Student(3, "pankaj"));

		Collections.sort(studentList, new AgeComparator());//Sorting with comparator with java.util package
		

		for (Student obj : studentList) {
			System.out.println(obj.getName() + " " + obj.getAge());
		}
		Collections.shuffle(studentList);
		for (Student obj : studentList) {
			System.out.println(obj.getName() + " " + obj.getAge());
		}
		Collections.sort(studentList);//sorting with comparable interface present in java.lang
		for (Student obj : studentList) {
			System.out.println(obj.getName() + " " + obj.getAge());
		}
	}
}
