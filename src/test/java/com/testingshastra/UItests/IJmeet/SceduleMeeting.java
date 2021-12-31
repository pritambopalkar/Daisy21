package com.testingshastra.UItests.IJmeet;

import org.testng.annotations.Listeners;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.testingshastra.Keywords.UIKeywords;
import com.testingshastra.config.BaseClass;
/*import com.testingshastra.util.Locator;*/
import com.testingshastra.util.TestListener;



@Listeners(TestListener.class)
public class SceduleMeeting extends BaseClass {
	public static final Logger LOG = Logger.getLogger(SceduleMeeting.class);

	UIKeywords keyword1 = UIKeywords.getInstance();

	@Test
	public void validateSceduleMeeting() {
	/*	String url = ("https://www.ijmeet.com");
		keyword1.launchUrl(url);
		LOG.info("Url is Launched:" + url);
		keyword1.click(Locator.SIGNIN_BUTTON);
		keyword1.enterText(Locator.SIGNIN_EMAILADDRESS, "Pritambopalkar19@gmail.com");
		keyword1.enterText(Locator.SIGNIN_PASSWORD, "Pritam19@");
		keyword1.click(Locator.SIGNIN_REMEMBER);
		keyword1.click(Locator.SIGNIN_SIGNIN);
		keyword1.click(Locator.SIGNIN_SCHEDULEMEETING);
		/*
		 * keyword1.enterText(Locator.SIGNIN_TOPIC, "Group disscussion");
		 * keyword1.enterText(Locator.SIGNIN_DESCRIPTION, "GD on IJmeetproject");
		 

		LOG.info("Clicked on SignIn page");
		*/
	}
}
