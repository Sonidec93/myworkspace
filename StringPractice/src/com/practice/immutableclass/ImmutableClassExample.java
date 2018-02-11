package com.practice.immutableclass;

public final class ImmutableClassExample {

	private final String Name;

	public ImmutableClassExample(String Name){
		this.Name=Name;
	}

	public String getName() {
		return Name;
	}

	public static void main(String [] arg){

		ImmutableClassExample obj=new ImmutableClassExample("Mukul");

		System.out.println("here i have created a immutable class where there is only getter method no setter");
		System.out.println(obj.getName());

	}
}

