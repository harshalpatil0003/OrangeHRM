package TestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseClass.BaseClass1;

public class OrangeHRMVerifications extends BaseClass1{

	@Test
	public void test_001() throws Exception{
		
		WebElement btn = dr.findElement(By.xpath("//button[@title='Assign Leave']"));
		
		if (btn.isDisplayed()) {
			System.out.println("Test Case passed, Button is displayed");
		}
		else {
			dr.close();
			throw new Exception("Test case fail, Button not displayed");
		}	
	}
	
	@Test
	public void test_002() throws Exception {
		
		dr.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Admin");
		
		if (dr.findElement(By.xpath("//span[text()='Admin']")).isDisplayed()) {
			System.out.println("Tests Case Passed, Admin is displayed");
		}
		else {
			dr.close();
			throw new Exception("Test Case Fail, Admin not displayed");
		}	
}

	@Test
	public void tset_003() throws Exception {
		
		if (dr.findElement(By.xpath("//button[@title='Apply Leave']")).isEnabled()) {
			System.out.println("Tests Case Passed, Apply Leave is enabled");
		}
		else {
			dr.close();
			throw new Exception("Test Case Fail, Apply Leave is disabled ");
		}
	}
}
