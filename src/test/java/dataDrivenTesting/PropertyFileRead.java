package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyFileRead {
	
	public static void main(String[] args) throws Throwable 
	{
		//Step 1: open the file in java readable format - . specifies current project - understood by jvm
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Data.properties");
		
		//Step 2: Create an object of properties class
		Properties p = new Properties();
		
		//Step 3: load the file input stream to properties
		p.load(fis);
		
		//Step 4: use the key to get the value
		String value = p.getProperty("username");
		String value1 = p.getProperty("abc");
		
		//Step 5: use the value
		System.out.println(value);
		System.out.println(value1);
		
	}

}
