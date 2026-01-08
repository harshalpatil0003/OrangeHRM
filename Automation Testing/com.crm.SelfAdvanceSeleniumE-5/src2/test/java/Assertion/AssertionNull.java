package Assertion;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertionNull {

	@Test(priority = 1)
	public void main() {
		WebDriver dr= new ChromeDriver();
		assertNotNull(dr,"Driver is null");
		Reporter.log("Driver is not null", true);
		dr.quit();
	}
	
	@Test(priority = 2)
	public void main2() {
		ChromeDriver dr= null;
		assertNull(dr,"Driver is not null");
		Reporter.log("Driver is null", true);
		
	}
}
