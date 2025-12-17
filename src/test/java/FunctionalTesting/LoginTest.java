package FunctionalTesting;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import java.io.IOException;
import java.util.List;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.crm.BaseClass.LoginBase;
import com.crm.FileUtility.ReadFromExcelFile;
import com.crm.FileUtility.ReadProperty;
import com.crm.POM.Login;

@Listeners(com.crm.Listeners.ExtentReportListeners.class)
public class LoginTest extends LoginBase {

	@Test
	public void tc_001() throws IOException  {
		 Login login = new Login(dr);
		assertEquals(dr.getCurrentUrl(),ReadProperty.propertiesFile("url"));
//		test.log(Status.INFO,"Landed on right page");
		Reporter.log("Landed to right page", true);
	}
	
	@Test
	public void tc_002() {
		 Login login = new Login(dr);
		assertTrue(login.getLogo().isDisplayed(), "Test Case fail, Logo not displayed");
		Reporter.log("Logo displayed", true);
	}
	
	@Test
	public void tc_003() {
		 Login login = new Login(dr);
		assertTrue(login.getUsername().isDisplayed() ," Tesecase fail, Username textfield is not visible");
		Reporter.log("Username TestField is displayed");
	}
	
	@Test
	public void Tc_004() {
		 Login login = new Login(dr);
		assertTrue(login.getPassword().isDisplayed(),"Testcase fail, Password textfield is not visible");
		Reporter.log("Password TestField is displayed");
	}
	
	@Test
	public void tc_005() {
		Login login= new Login(dr);
		assertTrue(login.getLogin_button().isDisplayed(),"Testcase fail, Login button not working");
		Reporter.log("Login Button is displayed");
	}
	
	@Test()
	public void tc_006() {
		 Login login = new Login(dr);
		assertTrue(login.getForgot_password().isDisplayed());
		Reporter.log("Forgot password is displayed");
	}
	
	@Test()
	public void tc_007() throws IOException {
		 Login login = new Login(dr);
		assertTrue(login.getUsernamePlaceHolder().isDisplayed());
		assertTrue(login.getPasswordPlaceHolder().isDisplayed());
	}
	
	@Test()
	public void tc_008() throws EncryptedDocumentException, IOException {
		Login login= new Login(dr);
		String wrongUser=ReadFromExcelFile.ReadExcel(1, 1, "LoginData");
		String wrongPass=ReadFromExcelFile.ReadExcel(1, 2, "LoginData");
		login.getUsername().sendKeys(wrongUser);
		login.getPassword().sendKeys(wrongPass);
		login.getLogin_button().click();
		List<WebElement> error = dr.findElements(By.xpath("//div[contains(@class,'oxd-alert-content--error')]"));
		assertFalse(error.isEmpty(),"User login, Test case Fail");
	}
	
	@Test()
	public void tc_009() throws IOException {
		Login login = new Login(dr);
		login.getForgot_password().click();
		assertEquals(dr.getCurrentUrl(), propertiesFile("forgotpass"), "Testcase fail, user not at forgot password page");
	}
	@Test()
	public void tc_010() {
		Login login = new Login(dr);
		assertTrue(login.getDemo_credentials().isDisplayed(), "Testcase fail, Demo credentials are not visible");
	}
}
