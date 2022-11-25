package com.ttt.driverutils;

import org.openqa.selenium.WebDriver;

public class UiDriverManager {

	private UiDriverManager() {
		
	}
	
	private static ThreadLocal<WebDriver> thDriver = new ThreadLocal<>();
	
	public static WebDriver getDriver() {
		return thDriver.get();
	}
	
	public static void setDriver(WebDriver driver) {
		thDriver.set(driver);
	}
	
	public static void unloadDriver() {
		thDriver.remove();
	}
	
	
	
}
