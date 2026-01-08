package Execution2;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Leave {

	@Test(groups = "smoke")
	public void tc_007() throws InterruptedException{
	Reporter.log("iam Leave tc_007",true);
	ChromeDriver dr= new ChromeDriver();
	dr.manage().window().maximize();
	dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	dr.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	dr.close();
	}
	
	@Test(groups = "smoke")
	public void tc_008() throws InterruptedException  {
	Reporter.log("iam Leave tc_008",true);
	ChromeDriver dr= new ChromeDriver();
	dr.manage().window().maximize();
	dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	dr.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	dr.close();
	}
}
