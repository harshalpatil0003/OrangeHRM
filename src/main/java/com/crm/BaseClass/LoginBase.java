package com.crm.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LoginBase extends MasterBase {
	@BeforeMethod
	public void preCondition() {
		mpreCondition();
	}

	@AfterMethod
	public void postCondition() {
		mpostConditions();
	}
}
