package com.testingshastra.UItests.IJmeet;

import java.time.Duration;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.testingshastra.Keywords.UIKeywords;
import com.testingshastra.config.BaseClass;
import com.testingshastra.pages.HomePage;
import com.testingshastra.pages.JoinMeetingPage;
import com.testingshastra.util.WaitsFor;

public class POMHomePageTests extends BaseClass {
	UIKeywords k2 = UIKeywords.getInstance();
	
	@Test
	public void verifyTitleOfHomePage() {
		
		String Expectedtitle = "IJmeet";
		Assert.assertEquals(k2.driver.getTitle(), Expectedtitle);
		
	}
	
	@Test
	public void verifyIfUserRedirectsToJoinMeetingPage() throws InterruptedException {
		HomePage home = new HomePage();
		
		home.rightClickOnNavBarContent();
		Thread.sleep(5000);
		home.clickOnJoinMeetingTab();
		
		
		JoinMeetingPage joinmeeting = new JoinMeetingPage();
		WaitsFor.elementToBeVisible(joinmeeting.quickjoinMeetingTitle, 5);
		String actual = joinmeeting.getQuickJoinMeetingTitle();
		
		Assert.assertTrue(actual.contains("Quick"));
		
		}
		
		@Test
		public void printAllInfoLinks() {
			HomePage home = new HomePage();
			home.getTextOfInfoLinks();
		}
		
		
	}


