package FunctionalTesting;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.util.RetryAnalyzerCount;

import com.crm.BaseClass.DashBoardBase;
import com.crm.FileUtility.ReadFromExcelFile;
import com.crm.POM.Dashboard;
import com.crm.POM.PIM;

public class PIMTest extends DashBoardBase {

	@Test()
	public void tc_001() throws EncryptedDocumentException, IOException {
		PIM pim= new PIM(dr);
		Dashboard board= new Dashboard(dr);
		board.getPIM().click();
		assertEquals(dr.getCurrentUrl(), ReadFromExcelFile.ReadExcel(3, 0, "url"), "TestCase fail, User Landed to wrong page");
	}
	
	@Test(retryAnalyzer = com.crm.Listeners.NetworkExecute.class)
	public void tc_002() throws EncryptedDocumentException, IOException {
		PIM pim= new PIM(dr);
		Dashboard board= new Dashboard(dr);
		board.getPIM().click();
		System.out.println(pim.getDropdowns().size());
		for (int i = 0; i < pim.getDropdowns().size(); i++) {
			if (i==0) {
				pim.getDropdowns().get(i).click();
				
				for (int j = 0; j <pim.getOptions().size(); j++) {
					if (j==0) {
						pim.getOptions().get(j).click();
						assertEquals(dr.getCurrentUrl(), ReadFromExcelFile.ReadExcel(1, 0, "pim"));
						board.getPIM().click();
						pim.getDropdowns().get(i).click();
						Reporter.log("Optional field", true);
					}
					else if (j==1) {
						pim.getOptions().get(j).click();
						assertEquals(dr.getCurrentUrl(), ReadFromExcelFile.ReadExcel(2, 0, "pim"));
						board.getPIM().click();
						pim.getDropdowns().get(i).click();
						Reporter.log("Custom field", true);
					}
					else if (j==2) {
						pim.getOptions().get(j).click();
						assertEquals(dr.getCurrentUrl(), ReadFromExcelFile.ReadExcel(3, 0, "pim"));
						board.getPIM().click();
						pim.getDropdowns().get(i).click();
						Reporter.log("Data import", true);
					}
					else if (j==3) {
						pim.getOptions().get(j).click();
						assertEquals(dr.getCurrentUrl(), ReadFromExcelFile.ReadExcel(4, 0, "pim"));
						board.getPIM().click();
						pim.getDropdowns().get(i).click();
						Reporter.log("Reporting Methods", true);
					}
					else if (j==4) {
						pim.getOptions().get(j).click();
						assertEquals(dr.getCurrentUrl(), ReadFromExcelFile.ReadExcel(5, 0, "pim"));
						Reporter.log("Termination Reasons", true);
					}
				}
				board.getPIM().click();
				
			} 
			else if(i==1) {
				System.out.println("hrfjsn");
				pim.getDropdowns().get(i).click();
				assertEquals(dr.getCurrentUrl(), ReadFromExcelFile.ReadExcel(1, 1, "pim"));
				board.getPIM().click();
				Reporter.log("Employee List");
			} else if(i==2) {
				System.out.println("hrfjsn");
				pim.getDropdowns().get(i).click();
				assertEquals(dr.getCurrentUrl(), ReadFromExcelFile.ReadExcel(1, 2, "pim"));
				board.getPIM().click();
				Reporter.log("Add Employee");
			}
			else if(i==3) {
				System.out.println("hrfjsn");
				pim.getDropdowns().get(i).click();
				assertEquals(dr.getCurrentUrl(), ReadFromExcelFile.ReadExcel(1, 3, "pim"));
				board.getPIM().click();
				Reporter.log("Reports");
			}
		}
	}
	
	@Test
	public void tc_003() {
		
	}
	
}