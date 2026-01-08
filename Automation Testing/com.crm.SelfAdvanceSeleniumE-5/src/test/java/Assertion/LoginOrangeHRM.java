package Assertion; 
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class LoginOrangeHRM{
	@Test
	public void main() throws Exception {
		
		String Expected_page="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String Actal_Page=dr.getCurrentUrl();
		
		 assertEquals(Actal_Page, Expected_page,"iam not in login page");
		 Reporter.log("iam in login page");
			WebElement username_field = dr.findElement(By.name("username"));
			username_field.sendKeys("Admin");
			WebElement password_field = dr.findElement(By.name("password"));
			password_field.sendKeys("admin123");
			dr.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(1000);
			String homepage_url= dr.getCurrentUrl();
			assertNotEquals(homepage_url, Expected_page,"Login Unsucessful");
			Reporter.log("Login Successful");
		
		dr.quit();
	}
}