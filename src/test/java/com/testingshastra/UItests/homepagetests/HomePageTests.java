package com.testingshastra.UItests.homepagetests;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.testingshastra.Keywords.UIKeywords;
import com.testingshastra.config.BaseClass;
import com.testingshastra.pages.HomePage;

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

	@Test
	public void validateAllLinksOfHomePage() throws IOException {
		HomePage home = new HomePage();
		List<WebElement> links = home.getAllLinks();
		Iterator<WebElement> itr = links.iterator();
		while (itr.hasNext()) {
			String url = itr.next().getAttribute("href");
			try {
				HttpsURLConnection con = (HttpsURLConnection) (new URL(url).openConnection());
				int code = con.getResponseCode();
				System.out.println("Url: "+url + "Status code: "+code);
				Assert.assertFalse(code > 400, "Link is Broken: " + url);

			} catch (MalformedURLException e) {
				System.out.println("Url: " + url);

			}

		}

	}
}
