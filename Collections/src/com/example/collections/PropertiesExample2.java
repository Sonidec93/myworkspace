package com.example.collections;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample2 {

	public static void main(String arg[]) {

		try {
			FileReader fr = new FileReader("INfo.properties");
			Properties prop = new Properties();
			prop.load(fr);

			System.out.println(prop.getProperty("name"));
			System.out.println(prop.getProperty("Age"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
