package TestCase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChronologicalConfigurationAnnotation {

	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	@Test(priority = 2)
	public void main1() {
		System.out.println("Main method");
	}
	@Test(priority = 1, dependsOnMethods ="main1")
	public void main2() {
		System.out.println("Main method2");
	}
	
}
