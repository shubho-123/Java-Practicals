package collectionprogram;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader file=new FileReader("C:\\Users\\Windows 10\\eclipse-workspace\\java has a is a\\src\\collectionprogram\\ValidName.properties");

		
		Properties pro=new Properties();
		pro.load(file);
		System.out.println("Username "+pro.getProperty("username"));
		System.out.println("Password: "+pro.getProperty("password"));
		
	}

}
