package com.crm.SeleniumUtility;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.crm.BaseClass.MasterBase;

public class ScreenShot extends MasterBase {

	public static void screenShot() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TakesScreenshot sh= (TakesScreenshot) dr;
		String from = sh.getScreenshotAs(OutputType.BASE64);
		ExtentReport.test.addScreenCaptureFromBase64String(from);
	}
}
