package com.example.collections;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PopertiesExample {

	public static void main(String [] arg){
		Properties prop=new Properties();
		
		prop.setProperty("name","Mukul");
		prop.setProperty("Age","24");
		
		try {
			prop.store(new FileWriter("Info.properties"),"Information stored");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
