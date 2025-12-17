package FunctionalTesting;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.crm.BaseClass.DashBoardBase;
import com.crm.POM.Dashboard;

@Listeners(com.crm.Listeners.ExtentReportListeners.class)
public class DashboardTest extends DashBoardBase{

	@Test
	public void tc_001() {
		Dashboard board= new Dashboard(dr);
		assertEquals(board.getHeader().getText(),"Dashboard","testcase fail, wrong header");
	}
	
	@Test
	public void tc_002() {
		Dashboard board= new Dashboard(dr);
		assertEquals(false, null);
	}
}
