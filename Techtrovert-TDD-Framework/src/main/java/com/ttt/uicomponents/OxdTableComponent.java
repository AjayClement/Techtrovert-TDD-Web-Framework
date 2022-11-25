package com.ttt.uicomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ttt.driverutils.UiDriverManager;
import com.ttt.uiutils.UiElementReusables;
import com.ttt.uiutils.UiWaitHandler;

public final class OxdTableComponent extends BaseComponent{

	private static final String ROW_LOCATOR_STR = "//div[text()='%s']//ancestor::div[@role='row']";
	private final By trashIconCellLocator = By.cssSelector(".bi-trash");
	WebElement parentElement = null;


	public OxdTableComponent() {
		super(UiDriverManager.getDriver());
		parentElement = getParentElement(By.cssSelector(".oxd-table"));
	}

	public WebElement getRowByUniqueCellValue(String uniqueCellValue) {
		By rowLoc = By.xpath(String.format(ROW_LOCATOR_STR
				, uniqueCellValue));
		try {
		  return UiWaitHandler.waitUntilElementVisible(
				parentElement.findElement(rowLoc), false);
		}catch(Exception e) {
		  return null;
		}
	}

	public boolean checkIfRowIsPresent(String uniqueCellValue) {
		return getRowByUniqueCellValue(uniqueCellValue)!=null;
	}

	public OrangeHrmDialogPopUpComponent deleteRow(WebElement row) {
		UiElementReusables.clickElement(
					row.findElement(trashIconCellLocator));
			return new OrangeHrmDialogPopUpComponent();
	}

}
