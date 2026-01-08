package Assertion;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssertTrueAndFalse {

	@Test
	public static void main() throws InterruptedException {
		
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		WebElement username = dr.findElement(By.xpath("//input[@name='username']"));
		assertTrue(username.isEnabled(),"username TextFiels is diabled");
		username.sendKeys("Admin");
		
	}
}
