package com.crm.BaseClass;
import java.io.IOException;
import com.crm.POM.Login;	
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
		try {
		Login login = new Login(dr);
		login.getUsername().sendKeys(propertiesFile("username"));
		login.getPassword().sendKeys(propertiesFile("password"));
		login.getLogin_button().click();
		}catch (IOException e) {
			// TODO: handle exception
		}
	}
@AfterMethod
	public void logout() {
		Dashboard dash= new Dashboard(dr);
		dash.getUserdropdown_icon().click();
		dash.getLogout().click();
	}

	@AfterMethod
	public void postCondition() {
		mpostConditions();
	}
}
