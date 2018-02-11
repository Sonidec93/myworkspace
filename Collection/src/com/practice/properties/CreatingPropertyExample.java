package com.practice.properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class CreatingPropertyExample {

	
	public static void main(String[] args) {
		
		Properties prop=new Properties();
		prop.setProperty("Game","Football");
		
		try {
			prop.store(new FileWriter("file1.properties"),"my first property file");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
