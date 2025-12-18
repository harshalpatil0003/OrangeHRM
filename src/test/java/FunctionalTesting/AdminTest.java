package FunctionalTesting;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.crm.BaseClass.DashBoardBase;
import com.crm.FileUtility.ReadFromExcelFile;
import com.crm.POM.Admin;
import com.crm.POM.Dashboard;

public class AdminTest extends DashBoardBase  {

	@Test
	public void tc_001() throws EncryptedDocumentException, IOException {
		Admin admin= new Admin(dr);
		Dashboard board= new Dashboard(dr);
		board.getAdmin().click();
		assertEquals(dr.getCurrentUrl(),ReadFromExcelFile.ReadExcel(2,0, "url"), "Testcase fail, not landed at right page");
	}
	@Test
	public void tc_002() {
		Admin admin= new Admin(dr);
		Dashboard board= new Dashboard(dr);
		board.getAdmin().click();
		assertEquals(admin.getDropDowns().size(), 7, "TestCase fail, there is no 7 dropdowns");
	}
	@Test
	public void tc_003() {
		Admin admin = new Admin(dr);
		Dashboard board= new Dashboard(dr);
		board.getAdmin().click();
		if (admin.getUsername().isEnabled() && admin.getUsername().isDisplayed()) {
			admin.getUsername().sendKeys("");
		}
	}
	
	@Test
	public void tc_004() throws InterruptedException, EncryptedDocumentException, IOException {
		Admin admin= new Admin(dr);
		Dashboard board= new Dashboard(dr);
		board.getAdmin().click();
		admin.getDropDowns().get(1).click();
		for (int i = 0; i <admin.getOption().size(); i++) {
			if (i==0) {
				admin.getOption().get(i).click();
				assertEquals(dr.getCurrentUrl(), ReadFromExcelFile.ReadExcel(1, 0, "admin"));
				board.getAdmin().click();
				admin.getDropDowns().get(1).click();
			}
			else if (i==1) {
				admin.getOption().get(i).click();
				assertEquals(dr.getCurrentUrl(), ReadFromExcelFile.ReadExcel(2, 0, "admin"));
				board.getAdmin().click();
				admin.getDropDowns().get(1).click();
			}
			else if (i==2) {
				admin.getOption().get(i).click();
				assertEquals(dr.getCurrentUrl(), ReadFromExcelFile.ReadExcel(3, 0, "admin"));
				board.getAdmin().click();
				admin.getDropDowns().get(1).click();
			}
			else if (i==3) {
				admin.getOption().get(i).click();
				assertEquals(dr.getCurrentUrl(), ReadFromExcelFile.ReadExcel(4, 0, "admin"));
				board.getAdmin().click();
				admin.getDropDowns().get(1).click();
			}
			else if (i==4) {
				admin.getOption().get(i).click();
				assertEquals(dr.getCurrentUrl(), ReadFromExcelFile.ReadExcel(5, 0, "admin"));
				board.getAdmin().click();
				admin.getDropDowns().get(1).click();
			}
		}
		
	}
	
	@Test
	public void tc_005() throws EncryptedDocumentException, IOException {
		Admin admin= new Admin(dr);
		Dashboard board= new Dashboard(dr);
		board.getAdmin().click();
		admin.getDropDowns().get(2).click();
		for (int i = 0; i <admin.getOption().size(); i++) {
			if (i==0) {
				admin.getOption().get(i).click();
				assertEquals(dr.getCurrentUrl(), ReadFromExcelFile.ReadExcel(1, 1, "admin"));
				board.getAdmin().click();
				admin.getDropDowns().get(2).click();
				Reporter.log("General Information", true);
			}
			else if (i==1) {
				admin.getOption().get(i).click();
				assertEquals(dr.getCurrentUrl(), ReadFromExcelFile.ReadExcel(2, 1, "admin"));
				board.getAdmin().click();
				admin.getDropDowns().get(2).click();
				Reporter.log("Location", true);
			}
			else if (i==2) {
				admin.getOption().get(i).click();
				assertEquals(dr.getCurrentUrl(), ReadFromExcelFile.ReadExcel(3, 1, "admin"));
				board.getAdmin().click();
				admin.getDropDowns().get(2).click();
				Reporter.log("Structures", true);
			}	
		}
	}
	@Test
	public void tc_006() throws EncryptedDocumentException, IOException {
		Admin admin= new Admin(dr);
		Dashboard board= new Dashboard(dr);
		board.getAdmin().click();
		admin.getDropDowns().get(3).click();
		for (int i = 0; i <admin.getOption().size(); i++) {
			if (i==0) {
				admin.getOption().get(i).click();
				assertEquals(dr.getCurrentUrl(), ReadFromExcelFile.ReadExcel(1, 2, "admin"));
				board.getAdmin().click();
				admin.getDropDowns().get(3).click();
				Reporter.log("Skills", true);
			}
			else if (i==1) {
				admin.getOption().get(i).click();
				assertEquals(dr.getCurrentUrl(), ReadFromExcelFile.ReadExcel(2, 2, "admin"));
				board.getAdmin().click();
				admin.getDropDowns().get(3).click();
				Reporter.log("Education", true);
			}
			else if (i==2) {
				admin.getOption().get(i).click();
				assertEquals(dr.getCurrentUrl(), ReadFromExcelFile.ReadExcel(3, 2, "admin"));
				board.getAdmin().click();
				admin.getDropDowns().get(3).click();
				Reporter.log("Liecenses", true);
			}
			else if (i==3) {
				admin.getOption().get(i).click();
				assertEquals(dr.getCurrentUrl(), ReadFromExcelFile.ReadExcel(4, 2, "admin"));
				board.getAdmin().click();
				admin.getDropDowns().get(3).click();
				Reporter.log("Languages", true);
			}
			else if (i==4) {
				admin.getOption().get(i).click();
				assertEquals(dr.getCurrentUrl(), ReadFromExcelFile.ReadExcel(5, 2, "admin"));
				board.getAdmin().click();
				admin.getDropDowns().get(3).click();
				Reporter.log("Memberships", true);
			}
		}
	}
	@Test
	public void tc_007() throws EncryptedDocumentException, IOException {
		Admin admin= new Admin(dr);
		Dashboard board= new Dashboard(dr);
		board.getAdmin().click();
		admin.getDropDowns().get(4).click();
		assertEquals(dr.getCurrentUrl(), ReadFromExcelFile.ReadExcel(1, 3, "admin"));
		Reporter.log("Nationalities", true);
		board.getAdmin().click();
		admin.getDropDowns().get(5).click();
		assertEquals(dr.getCurrentUrl(), ReadFromExcelFile.ReadExcel(1, 4, "admin"));
		Reporter.log("Corporate Brandings", true);

	}
	
	@Test
	public void tc_008() throws EncryptedDocumentException, IOException {
		Admin admin= new Admin(dr);
		Dashboard board= new Dashboard(dr);
		board.getAdmin().click();
		admin.getDropDowns().get(6).click();
		for (int i = 0; i <admin.getOption().size(); i++) {
			if (i==0) {
				admin.getOption().get(i).click();
				assertEquals(dr.getCurrentUrl(), ReadFromExcelFile.ReadExcel(1, 5, "admin"));
				board.getAdmin().click();
				admin.getDropDowns().get(6).click();
				Reporter.log("Email configuration", true);
			}
			else if (i==1) {
				admin.getOption().get(i).click();
				assertEquals(dr.getCurrentUrl(), ReadFromExcelFile.ReadExcel(2, 5, "admin"));
				board.getAdmin().click();
				admin.getDropDowns().get(6).click();
				Reporter.log("Email Subscription", true);
			}
			else if (i==2) {
				admin.getOption().get(i).click();
				assertEquals(dr.getCurrentUrl(), ReadFromExcelFile.ReadExcel(3, 5, "admin"));
				board.getAdmin().click();
				admin.getDropDowns().get(6).click();
				Reporter.log("Localization", true);
			}
			else if (i==3) {
				admin.getOption().get(i).click();
				assertEquals(dr.getCurrentUrl(), ReadFromExcelFile.ReadExcel(4, 5, "admin"));
				board.getAdmin().click();
				admin.getDropDowns().get(6).click();
				Reporter.log("Language packages", true);
			}
			else if (i==4) {
				admin.getOption().get(i).click();
				assertEquals(dr.getCurrentUrl(), ReadFromExcelFile.ReadExcel(5, 5, "admin"));
				board.getAdmin().click();
				admin.getDropDowns().get(6).click();
				Reporter.log("Modules", true);
			}
			else if (i==5) {
				admin.getOption().get(i).click();
				assertEquals(dr.getCurrentUrl(), ReadFromExcelFile.ReadExcel(6, 5, "admin"));
				board.getAdmin().click();
				admin.getDropDowns().get(6).click();
				Reporter.log("Social Media Authentication", true);
			}
			else if (i==6) {
				admin.getOption().get(i).click();
				assertEquals(dr.getCurrentUrl(), ReadFromExcelFile.ReadExcel(7, 5, "admin"));
				board.getAdmin().click();
				admin.getDropDowns().get(6).click();
				Reporter.log("Register O Auth client", true);
			}
			else if (i==7) {
				admin.getOption().get(i).click();
				assertEquals(dr.getCurrentUrl(), ReadFromExcelFile.ReadExcel(8, 5, "admin"));
				board.getAdmin().click();
				admin.getDropDowns().get(6).click();
				Reporter.log("LDAP Configuration", true);
			}
		}
	}
	
	@Test
	public void tc_009() {
		Admin admin= new Admin(dr);
		Dashboard board= new Dashboard(dr);
		board.getAdmin().click();
		admin.getToggle().click();
		assertFalse(admin.getForm().isDisplayed(), "Testscase fail, Form is displayed ");
	}
	
	@Test
	public void tc_010() {
		Admin admin= new Admin(dr);
		Dashboard board= new Dashboard(dr);
		List<WebElement> users=admin.getAdmins();
		System.out.println(users.size());
		board.getAdmin().click();
		admin.getTrash().get(1).click();
		admin.getDelete().click();
		System.out.println(admin.getAdmins().size());
		assertEquals(users.size(), admin.getAdmins().size());
	}

}