package com.ttt.uicomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ttt.driverutils.UiDriverManager;
import com.ttt.uiutils.UiElementReusables;
import com.ttt.uiutils.UiWaitHandler;

public final class OxdSelectWrapperComponent extends BaseComponent{

	private final By optionsLocator = By.cssSelector(".oxd-select-dropdown");
	private static final String OPTION_VALUE_TEXT_LOCATOR_STR = "//span[text()='%s']";
	private WebElement parentElement = null;

	public OxdSelectWrapperComponent() {
		super(UiDriverManager.getDriver());
		parentElement = getParentElement(By.className("oxd-select-wrapper"));
	}

	public OxdSelectWrapperComponent(String parentUniqueLocator) {
		super(UiDriverManager.getDriver());
		parentElement = getParentElement(
				By.xpath(parentUniqueLocator+"//div[@class='oxd-select-wrapper']")); 
	}

	public void selectOptionWithValueText(String value) {
		parentElement.click();
		UiElementReusables.clickElement(
				getOptionElementWithValueText(value));
	}

	public WebElement getOptionElementWithValueText(String value) {
		return UiWaitHandler.waitUntilElementVisible(parentElement
				.findElement(optionsLocator), true)
				.findElement(By.xpath(String.format(OPTION_VALUE_TEXT_LOCATOR_STR
						, value))
						);
	}

}
