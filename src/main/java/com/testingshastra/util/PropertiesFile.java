package com.testingshastra.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {

	public static String getProperty(String fileName, String key) {
		String dir = System.getProperty("user.dir");
		String x= System.getProperty("x");
		String value = "";
		try {
			FileInputStream fis = new FileInputStream(dir + fileName);
			Properties prop = new Properties();
			prop.load(fis);
			value = prop.getProperty(key);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return value;

	}

	/**
	 * This method returns the value of locator mentioned in ObjectRepository
	 * 
	 * @param key
	 * @throws IOException
	 */

	public static String getObject(String key) {
		return getProperty("/src/test/resources/ObjectRepository.properties", key);
	}
}
