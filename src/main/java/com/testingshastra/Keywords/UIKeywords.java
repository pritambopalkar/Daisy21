package com.testingshastra.Keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.testingshastra.config.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This class contains UI keywords which are applicable for WebElements and general Actions
 * This is Singleton class.To create object of this class we use {@code getInstance()} method 
 * @author Pritam Bopalkar
 *
 */

public class UIKeywords  {
	public  RemoteWebDriver driver = null;
	private static UIKeywords uikeywords;   //we made Single ton class
	static {
		uikeywords = new UIKeywords();
	}
	
	public static UIKeywords getInstance() {
		return uikeywords;
		
	}
	private UIKeywords() {
		
	}

	/**
	 * This Keyword is used to launch specified browser.
	 * 
	 * @author PritamBopalkar
	 * @param browserName must be one of the following
	 * <ul>
	 * <li>chrome</li> 
	 * <li>Edge</li> 
	 * <li>FireFox</li>
	 * </ul>
	 * 
	 */

	public void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if (browserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		} else if (browserName.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.err.println("Invalid Browser Name:" + browserName);

		}
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	
	public void launchUrl(String url) {
		driver.get(url);
	}
	
	public void click(WebElement element) {
		element.click();
	}
	
	public void enterText(WebElement element , String textToEnter) {
		element.sendKeys(textToEnter);
	}
	
	/**
	 * In the next version of framework, this method will be deleted. Instead you can use enterText(String object , String textToEnter
	 * @param locatorType
	 * @param locatorValue
	 * @param textToEnter
	 */
	@Deprecated
	public void enterText(String locatorType ,String locatorValue, String textToEnter) {
		
		getWebElement (locatorType , locatorValue).sendKeys(textToEnter);
	}
	
	public WebElement getWebElement(String locatorType, String locatorValue) {
		
		WebElement element = null;
		
		if(locatorType.equalsIgnoreCase("xpath")) {
			element = driver.findElement(By.xpath(locatorValue));
		}
		if(locatorType.equalsIgnoreCase("css")) {
			element = driver.findElement(By.cssSelector(locatorValue));
		}
		if(locatorType.equalsIgnoreCase("id")) {
			element = driver.findElement(By.id(locatorValue));
		}
		if(locatorType.equalsIgnoreCase("name")) {
			element = driver.findElement(By.name(locatorValue));
		}
		if(locatorType.equalsIgnoreCase("class")) {
			element = driver.findElement(By.className(locatorValue));
		}
		if(locatorType.equalsIgnoreCase("tag")) {
			element = driver.findElement(By.tagName(locatorValue));
		}
		return element;
		
	}
	public void switchToFrameAt(int index) {
		driver.switchTo().frame(index);
	}
	public void switchToDefaultContent() {
		driver.switchTo().defaultContent();
	}
	public void switchToFrame(String idOrName) {
		driver.switchTo().frame(idOrName);
	}
	public void switchToFrame(WebElement frame) {
		driver.switchTo().frame(frame);
		
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public String getTitleOfPage() {
		return driver.getTitle();
	}
	
	public RemoteWebDriver getDriver() {
		return driver;
		
	}
	public void click(String locatorType, String locatorValue) {
		
		getWebElement(locatorType , locatorValue).click();
		
		
	}
	public void switchToFrameAt1(int index) {
		driver.switchTo().frame(index);
		
	}
	public void enterText(String object, String textToEnter) {
		String[] parts = object.split("##");
		getWebElement(parts[0], parts[1]).sendKeys(textToEnter);
		
	}
	public void click(String object) {
		String[] parts = object.split("##");
		getWebElement(parts[0], parts[1]).click();;
		
	}
	public void openBrowser1(String browser) {
		
	}
		
	}
	
	


