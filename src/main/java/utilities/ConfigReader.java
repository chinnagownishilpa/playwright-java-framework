package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
 private static Properties properties;
 static {
	 try {
		 FileInputStream fis=new FileInputStream("src/test/resources/config.properties");
		 properties = new Properties();
		 properties.load(fis);
	 } catch(Exception e) {
		 throw new RuntimeException("Filed to load config.properties");
	 }
 }
 
 public static String getProperty(String key) {
	 return properties.getProperty(key);
 }
 
}
