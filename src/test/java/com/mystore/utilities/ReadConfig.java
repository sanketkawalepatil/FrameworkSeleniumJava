   package com.mystore.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {
	
Properties properties;	

String path = "E:\\java\\Automation Framework\\MyStore\\Configuration\\config.properties";

public ReadConfig() {
	try {
properties = new Properties();

	FileInputStream fis = new FileInputStream(path);
	properties.load(fis);
	
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}
public String getBaseUrl()
{
	String value = properties.getProperty("baseUrl");
	
	if(value!=null)
		return value;
	else 
		throw new RuntimeException("url is not specified");
		
	}
public String getBrowser()
{
	String value = properties.getProperty("browser");
	
	if(value!=null)
		return value;
	else 
		throw new RuntimeException("url is not specified");
		
	}
public String getEmail() 
{
String value = properties.getProperty("email");
	
	if(value!=null)
		return value;
	else 
		throw new RuntimeException("Email is not Found");
}
public String getPassword() {
String value = properties.getProperty("password");
	
	if(value!=null)
		return value;
	else 
		throw new RuntimeException("password is not Found");
}

}
