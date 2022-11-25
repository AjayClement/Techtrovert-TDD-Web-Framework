package com.ttt.uiutils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.util.concurrent.Uninterruptibles;
import com.ttt.driverutils.UiDriverManager;

public final class UiElementReusables {

	private UiElementReusables() {

	}

	public static void clickElementBy(By locator) {
		UiWaitHandler.waitUntilClickable(locator,true).click();
	}
	
	public static void clickElement(WebElement ele) {
		UiWaitHandler.waitUntilClickable(ele,true).click();
	}
	
	public static void submitElementBy(By locator) {
		UiWaitHandler.waitUntilClickable(locator,true).submit();
	}
	
	public static void submitElement(WebElement ele) {
		UiWaitHandler.waitUntilClickable(ele,true).submit();
	}

	public static void sendKeysElementBy(By locator, String value) {
		UiWaitHandler.waitUntilElementVisible(locator, true)
		.sendKeys(value);
	}
	
	public static void sendKeysElementEle(WebElement ele, String value) {
		UiWaitHandler.waitUntilElementVisible(ele, true)
		.sendKeys(value);
	}

	public static WebElement getElementBy(By locator) {
		return UiWaitHandler.waitUntilElementVisible(locator, false);
	}

	public static void jsClickElementBy(By locator, WebDriver driver) {

		((JavascriptExecutor)driver
				).executeScript("arguments[0].click()", UiWaitHandler.waitUntilClickable(locator, true));
	}
	
	public static void jsClickElementEle(WebElement ele, WebDriver driver) {

		((JavascriptExecutor)driver
				).executeScript("arguments[0].click()", UiWaitHandler.waitUntilClickable(ele, true));
	}
	
	public static void jsExecuteScript(String script, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)UiDriverManager.getDriver(); 
		js.executeScript(script);
	}

	public static void slowAutoCompleteSendKeys(By locator, String value) {
		WebElement ele = UiWaitHandler.waitUntilElementVisible(locator, true);
		int i=0;
		while(i<value.length()) {
			ele.sendKeys(String.valueOf(value.charAt(i)));
			Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
			i++;
		}
		
	}
	
	public static void slowAutoCompleteSendKeys(WebElement ele, String value) {
		int i=0;
		while(i<value.length()) {
			ele.sendKeys(String.valueOf(value.charAt(i)));
			UiWaitHandler.shortUnInteruptedSleep();
			i++;
		}
		
	}


}
