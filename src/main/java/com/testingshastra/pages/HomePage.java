package com.testingshastra.pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testingshastra.Keywords.UIKeywords;

public class HomePage {
	UIKeywords k2 = UIKeywords.getInstance();

	@FindBy(css = "div#navbarContent li:nth-Child(1)")
	public WebElement joinMeetingTab;
	
	@FindBy(css = "a[href*='host_meeting']")
	public WebElement hostMeetingTab;
	
	public WebElement navbarContent; //Name or Id //*[@name='navbarContent'] OR //*[@id='navbarContent']
	

	@FindBy(css = "div.footer-last-view-support div:nth-child(3) li a ")
	public List<WebElement> infoLinks;

	public HomePage() {
		PageFactory.initElements(k2.driver, this);

	}

	public void clickOnJoinMeetingTab() {
		joinMeetingTab.click();
	}

	public void getTextOfInfoLinks() {
		Iterator<WebElement> itr = infoLinks.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().getText());
		}
	}
	
	public void rightClickOnNavBarContent() {
		Actions act = new Actions(k2.driver);
		act.contextClick(navbarContent).build().perform();;
		
	}

}
