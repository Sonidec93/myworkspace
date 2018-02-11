package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppConfig {

	private static final Properties PROPERTIES;
	private static InputStream ins;
	
	static{
		try {
			ins=new FileInputStream("src/main/java/resources/configuration.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PROPERTIES=new Properties();
		try {
			PROPERTIES.load(ins);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
