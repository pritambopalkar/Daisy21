package com.testingshastra.config;

import com.testingshastra.util.PropertiesFile;

public class Application {
	public static final String FILEPATH = "/src/main/resources/application.properties";

	public String getBrowser() {
		return PropertiesFile.getProperty(FILEPATH,"daisy.browser");
	}

	public String getAppUrl() {
		return PropertiesFile.getProperty(FILEPATH, "daisy.dev.app.url2");
	}

	public  String getDBUrl() {
		return PropertiesFile.getProperty(FILEPATH, "daisy.dev.db.url");
	}

	public String getUserName() {
		return PropertiesFile.getProperty(FILEPATH, "daisy.dev.app.username");
	}

	public String getPassword() {
		return PropertiesFile.getProperty(FILEPATH, "daisy.dev.app.password");
	}
}
