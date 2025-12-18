package FunctionalTesting;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.crm.BaseClass.DashBoardBase;
import com.crm.FileUtility.ReadFromExcelFile;
import com.crm.POM.Dashboard;

@Listeners(com.crm.Listeners.ExtentReportListeners.class)
public class DashboardTest extends DashBoardBase{

	@Test
	public void tc_001() throws EncryptedDocumentException, IOException {
		Dashboard board= new Dashboard(dr);
		assertEquals(dr.getCurrentUrl(),ReadFromExcelFile.ReadExcel(1,0, "url"), "Testcase fail, not landed at right page");
	}
	
	@Test
	public void tc_002() {
		Dashboard board= new Dashboard(dr);
		assertEquals(board.getHeader().getText(),"Dashboard","testcase fail, wrong header");
	}
	
	@Test
	public static void tc_003() {
		Dashboard board= new Dashboard(dr);
		assertEquals(board.getCards().size(), 7,"Testcase fail, less than 7 cards");
	}
	
	@Test
	public static void tc_004() {
		Dashboard board= new Dashboard(dr);
		assertTrue(board.getUpgrade_btn().isDisplayed() && board.getUpgrade_btn().isEnabled(), "Testcase fail, upgrade button not working");
	}
	
	@Test
	public static void tc_005() {
		Dashboard board= new Dashboard(dr);
		assertTrue(board.getUserDropdown().isDisplayed() && board.getUserDropdown().isEnabled(), "TestCase Fail, UserDropdown is not working");
	}
	
	@Test
	public static void tc_006() {
		Dashboard board= new Dashboard(dr);
		assertTrue(board.getApplyLeave().isEnabled() && board.getApplyLeave().isDisplayed(), "TestCase Fail, Apply leave is not working");
	}
	
	@Test
	public static void tc_007() {
		Dashboard board= new Dashboard(dr);
		assertTrue(board.getAssignLeave().isEnabled() && board.getAssignLeave().isDisplayed(), "TestCase Fail, Assign leave is not working");
	}
	
	@Test
	public static void tc_008() {
		Dashboard board= new Dashboard(dr);
		assertTrue(board.getLeaveList().isEnabled() && board.getLeaveList().isDisplayed(), "TestCase Fail, Leave list is not working");
	}
	
	@Test
	public static void tc_009() {
		Dashboard board= new Dashboard(dr);
		assertTrue(board.getTimesheets().isEnabled() && board.getTimesheets().isDisplayed(), "TestCase Fail, Time sheets is not working");
	}
	
	@Test
	public static void tc_010() {
		Dashboard board= new Dashboard(dr);
		assertTrue(board.getMyTimesheet().isEnabled() && board.getMyTimesheet().isDisplayed(), "TestCase Fail, My time sheets is not working");
	}
}
