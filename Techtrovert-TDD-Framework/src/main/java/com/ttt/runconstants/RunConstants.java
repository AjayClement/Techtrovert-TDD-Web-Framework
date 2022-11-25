package com.ttt.runconstants;

public class RunConstants{
  
	private RunConstants() {
		
	}
	private static final String CHROME_DRIVER_PATH = "/src/test/resources/drivers/chromedriver.exe";
	private static final String PROPERTY_FILE_PATH = "/src/main/resources/runconfig.properties";
    private static final String TEST_DATA_SHEET_PATH = "/src/test/resources/TestDataSheet.xlsx";
	
	public static String getChromeDriverPath() {
		return CHROME_DRIVER_PATH;
	}

	public static String getPropertyFilePath() {
		return PROPERTY_FILE_PATH;
	}
	
	public static String getTestDataSheetPath() {
		return TEST_DATA_SHEET_PATH;
	}

	
}
