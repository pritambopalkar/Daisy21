package com.testingshastra.UItests.IJmeet;

import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.testingshastra.Keywords.UIKeywords;
import com.testingshastra.config.BaseClass;
/*import com.testingshastra.util.Locator;*/
import com.testingshastra.util.TestListener;
import com.testingshastra.util.WaitsFor;


@Listeners(TestListener.class)
public class SignupPageTest extends BaseClass {
	public static final Logger LOG  = Logger.getLogger(SignupPageTest.class);
	
	UIKeywords keyword1 = UIKeywords.getInstance();
	
	@Test
	public void validateFullNameFieldForCorrectInput() {
	/*	String url = ("https://www.ijmeet.com");
		keyword1.launchUrl(url);
		LOG.info("Url is Launched:"+url);
		
		keyword1.click("css","li:nth-child(5) a.nav-link");
		LOG.info("Clicked on Registered button");
		
		//Approach 2
	//	WebElement signup = keyword1.getDriver().findElement(By.cssSelector("li:nth-child(5) a.nav-link"));
	//	keyword1.click(signup);
		
		
	//	keyword1.click("css","div#navbarContent>ul>li:nth-child(5)>a");
		
		keyword1.enterText(Locator.SIGNUP_FULLNAME, "Pritam Bopalkar");
		keyword1.enterText(Locator.SIGNUP_COMPANYNAME, "Testing Shastra");
		keyword1.enterText(Locator.SIGNUP_EMAIL , "Pritambopalkar19@gmail.com");
		
		keyword1.enterText(Locator.SIGNUP_CONTACT,"8180908769");
		keyword1.enterText(Locator.SIGNUP_PASSWORD,"Pritam19@");
		
		keyword1.switchToFrameAt(0);
		LOG.info("Switched inside a frame");
		WaitsFor.elementToBeClickable(keyword1.getWebElement("css", "div.recaptcha-checkbox-border"));
		keyword1.click("css","div.recaptcha-checkbox-border");
		keyword1.switchToDefaultContent();
		LOG.info("Jumped back from frame");
		keyword1.click("css","button[type='submit']");
		String actualUrl = keyword1.getCurrentUrl();
		AssertJUnit.assertTrue(actualUrl.contains("dashboard"));
		*/
	}

}
