package ch09;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class PropertiesExample {

	public static void main(String[] args) {
		Properties prop = new Properties();
		try {
			prop.load(new FileReader("database.properties"));
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(prop.getProperty("dirver"));
		System.out.println(prop.getProperty("url"));
		
	}

}
