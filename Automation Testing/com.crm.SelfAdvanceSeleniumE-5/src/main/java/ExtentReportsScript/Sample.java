package ExtentReportsScript;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Sample {

	
	@Test
	public void login() {
		
		//ExtentSparkReport Object
		ExtentSparkReporter spark= new ExtentSparkReporter(".\\src\\test\\resources\\Reports\\sample.html");
		//config ExtentReport
		spark.config().setDocumentTitle("Orange HRM");
		spark.config().setReportName("Shashikant");
		spark.config().setTheme(Theme.DARK);
		
		// Object for extent report
		ExtentReports report= new ExtentReports();
		
		// set system configuration
		report.setSystemInfo("Device ", "HP Victus");
		report.setSystemInfo("OS ", "Windows 11");
		report.setSystemInfo("Browser", "chrome-11");
		
		// attach spark report
		report.attachReporter(spark);
		ExtentTest test=report.createTest("login");
		System.out.println("Login TestCase");
		// push all details
		report.flush();
	}
}
