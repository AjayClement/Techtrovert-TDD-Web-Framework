package com.ttt.orangehrmpages;

import org.openqa.selenium.By;

import com.ttt.driverutils.UiDriverManager;
import com.ttt.uicomponents.OxdTableComponent;
import com.ttt.uimodules.AddUserUiModule;
import com.ttt.uimodules.RecordsFoundModule;
import com.ttt.uiutils.UiElementReusables;

public final class AdminPage extends BasePage{


	private final By addUserLoc =  By.cssSelector("i.bi-plus");

	public AdminPage() {
		super(UiDriverManager.getDriver());
	}

	public AdminPage clickAddUser() {
		UiElementReusables.clickElementBy(addUserLoc);
		return this;
	}

	public AdminPage enterAndSaveEmployeeDetails(String userRole,
			                        String employeeName, String status,
			                        String userName,String password){
		new AddUserUiModule().selectUserRole(userRole)
		                     .enterEmployeeName(employeeName)
		                     .selectStatus(status)
		                     .enterUserName(userName)
		                     .enterPassword(password)
		                     .confirmPassword(password)
		                     .waitBeforeSavingEmployeeDetails()
		                     .saveEmployeeDetails();
		return this;
	}
	
	public AdminPage deleteUser(String userName) {
		  new RecordsFoundModule().deleteRecord(userName);
		  return this;
	}


}
