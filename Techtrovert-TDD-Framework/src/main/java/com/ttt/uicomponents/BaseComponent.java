package com.ttt.uicomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ttt.orangehrmpages.BasePage;
import com.ttt.uiutils.UiWaitHandler;

public class BaseComponent extends BasePage{

	protected BaseComponent(WebDriver driver) {
		super(driver);
	}
	
	protected WebElement getParentElement(By locator) {
		return UiWaitHandler.waitUntilElementVisible(locator, true);
	}

}
