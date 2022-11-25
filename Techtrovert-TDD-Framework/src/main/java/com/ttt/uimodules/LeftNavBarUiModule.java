package com.ttt.uimodules;

import org.openqa.selenium.By;

import com.ttt.commonutils.PageNameContext;
import com.ttt.driverutils.UiDriverManager;
import com.ttt.enums.Context;
import com.ttt.enums.PageName;
import com.ttt.orangehrmpages.AdminPage;
import com.ttt.orangehrmpages.BuzzPage;
import com.ttt.orangehrmpages.DashboardPage;
import com.ttt.orangehrmpages.DirectoryPage;
import com.ttt.orangehrmpages.IPageMarker;
import com.ttt.orangehrmpages.LeavePage;
import com.ttt.orangehrmpages.MaintenancePage;
import com.ttt.orangehrmpages.MyInfoPage;
import com.ttt.orangehrmpages.PerformancePage;
import com.ttt.orangehrmpages.PimPage;
import com.ttt.orangehrmpages.RecruitmentPage;
import com.ttt.uiutils.UiElementReusables;

public final class LeftNavBarUiModule extends BaseModule{
    
	PageNameContext pageNameContext;
	
	public LeftNavBarUiModule() {
		super(UiDriverManager.getDriver());
		pageNameContext= new PageNameContext();
	}
	
	String menuNavLinkLocStr = "//span[text()='%s']"; 
	
	public IPageMarker navigate(PageName navigateTo) {
		
		switch (navigateTo) {
		   case ADMIN:
			   UiElementReusables.clickElementBy(By.xpath(String.format(menuNavLinkLocStr, "Admin"))); 
			   pageNameContext.setPageContext(Context.CURRENT_PAGE, new AdminPage()); 
			     return PageName.ADMIN.getPageObject();
		   case PIM:
			   UiElementReusables.clickElementBy(By.xpath(String.format(menuNavLinkLocStr, "PIM"))); 
			   pageNameContext.setPageContext(Context.CURRENT_PAGE, new PimPage());
			     return PageName.PIM.getPageObject();
		   case PERFORMANCE:
			   UiElementReusables.clickElementBy(By.xpath(String.format(menuNavLinkLocStr, "Performance")));
			   pageNameContext.setPageContext(Context.CURRENT_PAGE, new PerformancePage());
			     return PageName.PERFORMANCE.getPageObject();
		   case LEAVE:
			   UiElementReusables.clickElementBy(By.xpath(String.format(menuNavLinkLocStr, "Leave")));
			   pageNameContext.setPageContext(Context.CURRENT_PAGE, new LeavePage());	 
			     return PageName.LEAVE.getPageObject();
		   case DASHBOARD:
			   UiElementReusables.clickElementBy(By.xpath(String.format(menuNavLinkLocStr, "Dashboard")));
			   pageNameContext.setPageContext(Context.CURRENT_PAGE, new DashboardPage());
				 return PageName.DASHBOARD.getPageObject();
		   case DIRECTORY:
			   UiElementReusables.clickElementBy(By.xpath(String.format(menuNavLinkLocStr, "Directory")));
			   pageNameContext.setPageContext(Context.CURRENT_PAGE, new DirectoryPage());
				 return PageName.DIRECTORY.getPageObject();
		   case MAINTENANCE:
			   UiElementReusables.clickElementBy(By.xpath(String.format(menuNavLinkLocStr, "Maintenance")));
			   pageNameContext.setPageContext(Context.CURRENT_PAGE, new MaintenancePage());
				 return PageName.MAINTENANCE.getPageObject();
		   case MY_INFO:
			   UiElementReusables.clickElementBy(By.xpath(String.format(menuNavLinkLocStr, "My Info")));
			   pageNameContext.setPageContext(Context.CURRENT_PAGE, new MyInfoPage());
				 return PageName.MY_INFO.getPageObject();
		   case TIME:
			   UiElementReusables.clickElementBy(By.xpath(String.format(menuNavLinkLocStr, "Time")));
			   pageNameContext.setPageContext(Context.CURRENT_PAGE, new DashboardPage());
				 return PageName.TIME.getPageObject();
		   case RECRUITMENT:
			   UiElementReusables.clickElementBy(By.xpath(String.format(menuNavLinkLocStr, "Recruitment")));
			   pageNameContext.setPageContext(Context.CURRENT_PAGE, new RecruitmentPage());
				 return PageName.RECRUITMENT.getPageObject();
		   case BUZZ:
			   UiElementReusables.clickElementBy(By.xpath(String.format(menuNavLinkLocStr, "Buzz"))); 
			   pageNameContext.setPageContext(Context.CURRENT_PAGE, new BuzzPage());
				 return PageName.BUZZ.getPageObject();
		   default:
			     return null;
		}
		 
	}
	
}
