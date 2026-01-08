package Execution2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import BaseClass.BaseClass1;

public class Admin{

	@Test(groups = "smoke") 
	public void tc_003() throws IOException, InterruptedException {
	Reporter.log("iam Admin tc_003",true);
	WebDriver dr= new ChromeDriver();
	dr.manage().window().maximize();
	dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	dr.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	dr.close();
	
	}
	
	@Test(groups = "smoke")
	public void tc_004() throws IOException, InterruptedException {
	Reporter.log("iam Admin tc_002",true);
	WebDriver dr= new ChromeDriver();
	dr.manage().window().maximize();
	dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	dr.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	dr.close();
	}
}
