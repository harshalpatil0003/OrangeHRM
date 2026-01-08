package com.crm.Listeners;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import BaseClass.BaseClass1;

public class FailedTestCaseScreenshot extends BaseClass1 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		String name = result.getMethod().getMethodName();
		Reporter.log(name+ "Is on testStart", true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String name = result.getMethod().getMethodName();
		Reporter.log(name+ "Is on test success", true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		String date = LocalDateTime.now().toString().replace(':', '-');
		String name= result.getMethod().getMethodName();
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		TakesScreenshot sh= (TakesScreenshot) dr;
		File from = sh.getScreenshotAs(OutputType.FILE);
		
		File to= new File(".\\src\\test\\resources\\Screenshots\\"+date+name+".png");
		try {
			FileHandler.copy(from, to);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String name = result.getMethod().getMethodName();
		Reporter.log(name+ "Is on tsetskipped", true);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

	
	
}
