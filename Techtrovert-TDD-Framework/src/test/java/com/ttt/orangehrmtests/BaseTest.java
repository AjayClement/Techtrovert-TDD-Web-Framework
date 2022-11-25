package com.ttt.orangehrmtests;


import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.ttt.commonutils.PropertyManager;
import com.ttt.driverutils.UiDriver;
import com.ttt.driverutils.UiDriverManager;
import com.ttt.enums.BrowserType;
import com.ttt.uiutils.UiWaitHandler;

public class BaseTest {
	
	protected BaseTest() {
		
	}

	@BeforeMethod
	public void launchUrl() {
		UiDriver.initializeDriver(PropertyManager.getBrowserTypeProperty());
		UiDriver.launchUrl(PropertyManager.getUrlProperty());
		Reporter.log("Url Launched: "+PropertyManager.getUrlProperty());	
	}
	
	@AfterMethod
	public void tearDown() {
		UiDriver.quitDriver();
		Reporter.log("Browser Closed");
	}
	
	
}
