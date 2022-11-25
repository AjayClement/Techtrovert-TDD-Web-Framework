package com.ttt.orangehrmpages;


import com.ttt.driverutils.UiDriverManager;
import com.ttt.enums.PageName;
import com.ttt.uimodules.HeaderUiModule;
import com.ttt.uimodules.LeftNavBarUiModule;


public final class CommonPage extends BasePage{
	
	private HeaderUiModule headerUiModule;
	private LeftNavBarUiModule leftNavBarUiModule;
	
	public CommonPage() {
		super(UiDriverManager.getDriver());
		headerUiModule = new HeaderUiModule();
		leftNavBarUiModule = new LeftNavBarUiModule();
	}
	
	public LoginPage logout() {
		return headerUiModule.clcikUserAccountDrpDwn().clickLogout();
	}
	
	public IPageMarker navigateUsingLeftnavBar(PageName nameOfPage) {
	   return leftNavBarUiModule.navigate(nameOfPage);	
	}
	
}
