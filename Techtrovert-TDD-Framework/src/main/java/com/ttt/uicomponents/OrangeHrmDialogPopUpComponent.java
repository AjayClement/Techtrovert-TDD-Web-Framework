package com.ttt.uicomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ttt.driverutils.UiDriverManager;

public final class OrangeHrmDialogPopUpComponent extends BaseComponent{

	
	WebElement parentElement = null;
	
	public OrangeHrmDialogPopUpComponent() {
		super(UiDriverManager.getDriver());
		parentElement = getParentElement(By.cssSelector(".orangehrm-dialog-popup"));
	}
	
	public void clickDelete() {
		new OxdButtonComponent().clickButton("Delete");
	}
	
	public void clickCancel() {
		new OxdButtonComponent().clickButton("Cancel");
	}
}
