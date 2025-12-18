package com.crm.BaseClass;
import java.io.IOException;
import com.crm.POM.Login;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.crm.POM.Dashboard;

public class DashBoardBase extends MasterBase {
	
	@BeforeClass
	public void preCondition() {
		mpreCondition();
	}
@BeforeMethod
	public void Login()  {
		mLogin();
	}
@AfterMethod
public void Logout() {
	mLogout();
}

	@AfterClass
	public void postCondition() {
		mpostConditions();
	}
}
