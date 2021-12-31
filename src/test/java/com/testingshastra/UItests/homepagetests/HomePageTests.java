package com.testingshastra.UItests.homepagetests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testingshastra.Keywords.UIKeywords;
import com.testingshastra.config.BaseClass;

/** 
 * 
 * @author Pritam
 *
 */


public class HomePageTests extends BaseClass {
	
	String expectedTitle = "Testing Shastra | Training | Placement";
	UIKeywords k1 = UIKeywords.getInstance();
	
	

	@Test
	public void verifyTitleOfHomePage() {
		k1.launchUrl("https://www.testingshastra.com");
		String title = k1.getTitleOfPage();
		Assert.assertEquals(title, expectedTitle);
		
	}

}
