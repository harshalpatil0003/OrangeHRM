package HRMTests;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.crm.BaseClass.LoginBase;
import com.crm.POM.Login;

//@Listeners(com.crm.Listeners.ExtentReportListeners.class)
public class TestScripts extends LoginBase{

//	public static ExtentTest test=null;
	
	@Test
	public void tc_001() {
		Login login= new Login(dr);
		assertTrue(login.getUsername().isEnabled());

	}
	
	@Test
	public void tc_002() {
		String name="Admin";
		Login login= new Login(dr);
		login.getUsername().sendKeys("Admin");
		assertEquals(login.getUsername().getAttribute("value"), name);
	}
	@Test
	public void tc_003() {
		Login login= new Login(dr);
		assertTrue(login.getPassword().isEnabled());
	}
	
}
