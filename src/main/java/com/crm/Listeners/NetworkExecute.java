package com.crm.Listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class NetworkExecute implements IRetryAnalyzer {

	@Override
	public boolean retry(ITestResult result) {
		int start=0, end=3;
		
		if (start<end) {
			start++;
			return true;
		}
		return false;
	}

}
