package Parametrization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;  

public class ReadXML {

	@Parameters({"url","username","password"})
	@Test
	public void readFromXML(String url, String username, String password) {
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		dr.get(url);
		dr.findElement(By.name("username")).sendKeys(username);
		dr.findElement(By.name("password")).sendKeys(password);
	}
	
	@Test
	public void testCheck() {
	    System.out.println("Loaded successfully");
	}

}
