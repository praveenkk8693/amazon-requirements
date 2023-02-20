package com.amazon.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CommonProperties {
	
	public static String getPropertyValue(String key) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("D:\\projects\\com-amazon-cucmber\\src\\test\\resources\\frequentlyChangingProps.properties");
		prop.load(fis);
		return prop.getProperty(key);
	}

}
