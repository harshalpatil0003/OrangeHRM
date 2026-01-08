package com.crm.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Simple implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("OnTest start", true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("OnTest success", true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("OnTest Failure", true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("OnTest Skipped", true);
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("Onstart", true);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("Onfinish", true);
	}

	
	
}
