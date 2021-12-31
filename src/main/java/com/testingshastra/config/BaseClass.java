package com.testingshastra.config;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.testingshastra.Keywords.UIKeywords;
import com.testingshastra.util.PropertiesFile;

public class BaseClass {
	UIKeywords keyword = UIKeywords.getInstance();
	public RemoteWebDriver Driver = null;
	
	
	@Parameters("browser-name")
	@BeforeMethod
	public void setUp(String browserName) {
		Application app = new Application();
	//	keyword.openBrowser("Chrome");
		keyword.openBrowser(browserName);
		this.Driver = keyword.getDriver();
	//	Driver.get(PropertiesFile.getProperty("/src/main/resources/application.properties", "daisy.dev.app.url2 "));
		Driver.get(app.getAppUrl());
	//	Driver.get("https://www.Ijmeet.com");
		
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		//keyword.quitBrowser();
	}

}
