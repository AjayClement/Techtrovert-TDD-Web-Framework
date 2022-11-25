package com.ttt.orangehrmpages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.ttt.uiutils.UiElementReusables;


public class BasePage implements IPageMarker{

	protected BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
}
