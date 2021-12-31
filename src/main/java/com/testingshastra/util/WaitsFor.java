package com.testingshastra.util;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testingshastra.Keywords.UIKeywords;

public class WaitsFor {
	private static final WebDriverWait wait;
	static  {
		wait = new WebDriverWait(UIKeywords.getInstance().driver, Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofMillis(500));
				
	}
	
		public static void elementToBeVisible(WebElement element , long duration) {
			wait.withTimeout(Duration.ofSeconds(duration));
			wait.ignoring(NoSuchElementException.class);
			wait.until(ExpectedConditions.visibilityOf(element));

		}
		
		public static void stalenessOf(WebElement element , int duration) {
			wait.withTimeout(Duration.ofSeconds(duration));
			wait.ignoring(NoSuchElementException.class);
			wait.until(ExpectedConditions.stalenessOf(element));

		}
		/**
		 * This method waits for element to be clickable .
		 * Max timeout id 30 seconds which is not configurable.
		 * @param element
		 */
		
		public static  void elementToBeClickable(WebElement element ) {
			wait.withTimeout(Duration.ofSeconds(30));
			wait.ignoring(NoSuchElementException.class);
			wait.until(ExpectedConditions.elementToBeClickable(element));

		}
		
}
