package HRMTests;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.crm.POM.Login;
import BaseClass.LoginBase;

@Listeners(com.crm.Listeners.ExtentReportListeners.class)
public class TestScripts extends LoginBase{

	@Test
	public void tc_001() {
		Login login= new Login(dr);
		assertTrue(login.username().isEnabled());
	}
	
	@Test
	public void tc_002() {
		String name="Admin";
		Login login= new Login(dr);
		login.username().sendKeys("Admin");
		assertEquals(login.username().getAttribute("value"), name);
	}
	@Test
	public void tc_003() {
		Login login= new Login(dr);
		assertTrue(login.password().isEnabled());
	}
	
}
