package TestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	
	@Test(priority = 1)
	public void test_001() throws Exception {
	
		 String username="Admin";
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement username_field = dr.findElement(By.name("username"));
		username_field.sendKeys(username);
		String current_data= username_field.getAttribute("value");
		System.out.println(current_data+"this is data");
		
		if (username.equals(current_data)) {
			System.out.println("testcase passed ");
		}
		else{
			dr.close();
			throw new Exception("data is not passed correctly");
		}
		dr.close();
	}
	
	@Test(priority = 2)
	public void test_002() throws Exception {
		String password="admin123";
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement password_field = dr.findElement(By.name("password"));
		password_field.sendKeys(password);
		String current_data= password_field.getAttribute("value");
		System.out.println(current_data+"this is data");
		
		if (password.equals(current_data)) {
			System.out.println("testcase passed ");
		}
		else{
			dr.close();
			throw new Exception("data is not passed correctly");
		}
		dr.close();
	}	
	
	@Test(priority = 3)
	public void test_003() throws Exception {
		String Expected_URL="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String username="Admin";
		String password="admin123";
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement username_field = dr.findElement(By.name("username"));
		username_field.sendKeys(username);
		String current_data1= username_field.getAttribute("value");
		
		WebElement password_field = dr.findElement(By.name("password"));
		password_field.sendKeys(password);
		String current_data2= password_field.getAttribute("value");
		dr.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		if (dr.getCurrentUrl().equals(Expected_URL)) {
			System.out.println("Landed to right page");
		}
		else{
			dr.close();
			throw new Exception("Landed to Wrong page");
		}
		dr.close();
	}
	
}
