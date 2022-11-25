package com.ttt.uicomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ttt.driverutils.UiDriverManager;
import com.ttt.uiutils.UiElementReusables;

public final class OxdButtonComponent extends BaseComponent{
	private WebElement parentElement = null;
	
	public OxdButtonComponent() {
		super(UiDriverManager.getDriver());
		parentElement = getParentElement(By.cssSelector(".oxd-button"));
	}
	
	public void clickButton(String buttonText) {
		  UiElementReusables.jsExecuteScript(
				  "const ele = "
				  + "document.getElementsByClassName('oxd-button')"
				  + "for (let index = 0; index < ele.length-1; index++) {"
				  + "    if (ele[index].innerText.includes('"+buttonText+"')){"
				  + "             ele[index].click()"
				  + "    }"
				  + "}"
				, UiDriverManager.getDriver());
		}
}


