package com.testingshastra.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.testingshastra.Keywords.UIKeywords;

public class JoinMeetingPage {
	UIKeywords k2 = UIKeywords.getInstance();

	@FindBy(how = How.CSS, using = "h2.m-txt")
	public WebElement quickjoinMeetingTitle;

	
	
	public JoinMeetingPage() {
		PageFactory.initElements(k2.driver, this);
	}

	public String getQuickJoinMeetingTitle() {
		return quickjoinMeetingTitle.getText();
	}
	

}
