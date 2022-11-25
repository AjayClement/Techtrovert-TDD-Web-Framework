package com.ttt.uicomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ttt.driverutils.UiDriverManager;
import com.ttt.uiutils.UiElementReusables;

public final class OxdInputComponent extends BaseComponent{
	
	private WebElement parentElement = null;
	
	
	public OxdInputComponent() {
		super(UiDriverManager.getDriver());
		parentElement= getParentElement(By.cssSelector(".oxd-input[autocomplete='off']"));
	}

	public OxdInputComponent(String parentUniqueLocator) {
		super(UiDriverManager.getDriver());
		parentElement = getParentElement(
				By.xpath(parentUniqueLocator+"//input[contains(@class,'oxd-input')][@autocomplete='off']")); 
	}
	
	public void autoCompleteOffEnterText(String text) {
		UiElementReusables.sendKeysElementEle(parentElement,text);
	}

}
