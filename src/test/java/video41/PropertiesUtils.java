package video41;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class PropertiesUtils {

	public static void main(String[] args) throws IOException {
		
		Properties propertiesObj = new Properties();
		
		//Read file
		FileInputStream file = new FileInputStream("C:\\Users\\PMLS\\eclipse-workspace\\SeleniumCourse\\src\\test\\java\\video41\\config.properties");
		
		//Load
		propertiesObj.load(file);
		
		//Read the value from a key
		System.out.println(propertiesObj.getProperty("appurl"));
		System.out.println(propertiesObj.getProperty("email"));
		System.out.println(propertiesObj.getProperty("password"));
		System.out.println(propertiesObj.getProperty("orderid"));
		System.out.println(propertiesObj.getProperty("customerid"));
		
		//Get all keys
		Set<String> keys = propertiesObj.stringPropertyNames();
		System.out.println(keys);

		//OR Get all keys as
		Set<Object> keyss = propertiesObj.keySet();
		System.out.println(keys);

		//Get all values
		Collection<Object> values = propertiesObj.values();
		System.out.println(values);
	}

}
