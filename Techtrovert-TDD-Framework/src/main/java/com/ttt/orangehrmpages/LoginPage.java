package com.ttt.orangehrmpages;

import org.openqa.selenium.By;
import com.ttt.driverutils.UiDriverManager;
import com.ttt.uiutils.UiElementReusables;

public final class LoginPage extends BasePage{

	private final By userName = By.xpath("//input[@name='username' or @placeholder='Username']");
	private final By password = By.xpath("//input[@name='password' or @type='password']");
	private final By loginButton = By.cssSelector(".orangehrm-login-button[type='submit']"); 
	private final By loginTitle = By.xpath("//*[contains(@class,'orangehrm-login-title')]"); 
	 
	public LoginPage() {
		super(UiDriverManager.getDriver());
	}
	 
	public LoginPage enterUserName(String usrName) {
		UiElementReusables.sendKeysElementBy(userName, usrName);
		return new LoginPage();
	}
	
	public LoginPage enterPassword(String pswrd) {
		UiElementReusables.sendKeysElementBy(password, pswrd);
		return new LoginPage();
	}
	
	 public CommonPage login(String usrName, String pswrd) {
		 enterUserName(usrName).enterPassword(pswrd);
		 UiElementReusables.clickElementBy(loginButton);
		 return new CommonPage();
	 }
	 
	 public boolean checkLoginTitle() {
		 return UiElementReusables.getElementBy(loginTitle)!=null;
	 }
	
	
	
}
