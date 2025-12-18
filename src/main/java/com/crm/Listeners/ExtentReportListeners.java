package com.crm.Listeners;
import javax.naming.Context;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.Status;
import com.crm.SeleniumUtility.ExtentReport;
import com.crm.SeleniumUtility.ScreenShot;

public class ExtentReportListeners extends ExtentReport implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
		String name = result.getMethod().getMethodName();
		String classname = result.getClass().getName();
		test=report.createTest(name);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String name = result.getMethod().getMethodName();
		test.log(Status.PASS, name+" is pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {

		String name= result.getMethod().getMethodName();
		test.log(Status.FAIL, name+" is fail");
		ScreenShot.screenShot();
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String name = result.getMethod().getMethodName();
		test.log(Status.SKIP, name+" is skip");
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("method started", true);
		
		//method to generate report
		String module=context.getAllTestMethods()[0].getTestClass().getRealClass().getSimpleName();
		extentReport(module);
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}
}