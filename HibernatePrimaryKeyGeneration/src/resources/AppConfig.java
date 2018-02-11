package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppConfig {

	public static final Properties PROPERTIES;
	public static  InputStream inputStream=null;

	static{

		try {
			inputStream=new FileInputStream("src/resources/configuration.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PROPERTIES=new Properties();
		try {
			PROPERTIES.load(inputStream);



		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
