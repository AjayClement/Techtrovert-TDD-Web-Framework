package com.ttt.enums;

import com.ttt.orangehrmpages.AdminPage;
import com.ttt.orangehrmpages.BuzzPage;
import com.ttt.orangehrmpages.DashboardPage;
import com.ttt.orangehrmpages.DirectoryPage;
import com.ttt.orangehrmpages.CommonPage;
import com.ttt.orangehrmpages.LeavePage;
import com.ttt.orangehrmpages.LoginPage;
import com.ttt.orangehrmpages.MaintenancePage;
import com.ttt.orangehrmpages.MyInfoPage;
import com.ttt.orangehrmpages.IPageMarker;
import com.ttt.orangehrmpages.PerformancePage;
import com.ttt.orangehrmpages.PimPage;
import com.ttt.orangehrmpages.RecruitmentPage;
import com.ttt.orangehrmpages.TimePage;

import net.bytebuddy.asm.Advice.Return;

public enum PageName {
	LOGIN(new LoginPage()),
	HOME(new CommonPage()),
	ADMIN(new AdminPage()),
	PIM(new PimPage()),
	LEAVE(new LeavePage()),
	TIME(new TimePage()),
	RECRUITMENT(new RecruitmentPage()),
	MY_INFO(new MyInfoPage()),
	PERFORMANCE(new PerformancePage()),
	DASHBOARD(new DashboardPage()),
	DIRECTORY(new DirectoryPage()),
	MAINTENANCE(new MaintenancePage()),
	BUZZ(new BuzzPage());

	private IPageMarker pageObject;

	private PageName() {

	}

	private PageName(IPageMarker obj) {
		this.pageObject = obj;
	}

	public IPageMarker getPageObject() {
		return pageObject;
	}

}
