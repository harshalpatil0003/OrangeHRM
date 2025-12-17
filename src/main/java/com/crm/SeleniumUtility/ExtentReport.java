package com.crm.SeleniumUtility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {
	public static ExtentSparkReporter spark=null;
	public static ExtentReports report=null;
	public static ExtentTest test=null;
	
	public static void extentReport() {
		//ExtentSparkReport Object
		spark= new ExtentSparkReporter(".\\src\\test\\resources\\Report\\"+test+".html");
		//config ExtentReport
		spark.config().setDocumentTitle("Orange HRM");
		spark.config().setReportName("Shashikant");
		spark.config().setTheme(Theme.DARK);
		
		// Object for extent report
		report= new ExtentReports();
		
		// set system configuration
		report.setSystemInfo("Device ", "HP Victus");
		report.setSystemInfo("OS ", "Windows 11");
		report.setSystemInfo("Browser", "chrome-11");
		
		// attach spark report
		report.attachReporter(spark);
	}
	
}
