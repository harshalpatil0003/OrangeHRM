package Listeners;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClass.BaseClass1;

@Listeners(com.crm.Listeners.FailedTestCaseScreenshot.class)
public class TakescreenshotOnTestFail extends BaseClass1 {

	@Test
	public void takescreenShot() {
		
		assertEquals(dr.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/leave/assignLeave", "Not at assign leave page");
		Reporter.log("At assign leave page", true);
		
	}
	
}
