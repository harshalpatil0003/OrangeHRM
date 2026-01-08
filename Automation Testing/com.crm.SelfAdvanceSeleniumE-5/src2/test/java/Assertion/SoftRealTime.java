package Assertion;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftRealTime {

	public static WebDriver dr =null;
	public static String browser="chrome";

	@Test
	public static void main() {
		
		if (browser.equals(browser)) {
			dr= new ChromeDriver();
		} else if(browser.equals("edge")){
			dr= new EdgeDriver();
		}else if(browser.equals("firefox")){
			dr= new EdgeDriver();
		}else {
			dr= new ChromeDriver();
		}
		assertNotNull(dr,"Driver is null");		
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		dr.get("https://demowebshop.tricentis.com/");
		dr.findElement(By.className("ico-login")).click();
		dr.findElement(By.id("Email")).sendKeys("abc@gmail.com");
		dr.findElement(By.id("Password")).sendKeys("123456");
		dr.findElement(By.xpath("//input[@value='Log in']")).click();
		
		SoftAssert soft= new SoftAssert();
		soft.assertEquals("https://demowebshop.tricentis.com/", dr.getCurrentUrl(),"failed to login");
		dr.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		dr.findElement(By.xpath("//input[@value='Add to cart']")).click();
		dr.findElement(By.className("ico-cart")).click();
		List<WebElement> products = dr.findElements(By.xpath("//a[text()='3rd Album']"));
		assertTrue(products.size()>0,"Product is not added, Test case fail");
		
		Reporter.log("Product is added and testcase pass", true);
		dr.quit();
		soft.assertAll();
		
	}
}
