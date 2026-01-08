package BaseClass;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.crm.FileUtility.ReadFromPropertiesFile;


public class BaseClass1 extends ReadFromPropertiesFile{
	public static WebDriver dr=null;
//	@BeforeClass
	public void preCondition(String browser, String url) throws IOException {
		 browser= ReadFromPropertiesFile.propertiesFile("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			dr= new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			dr= new FirefoxDriver();
			
		}
		else if (browser.equalsIgnoreCase("IE")) {
			dr=new InternetExplorerDriver();
		}
		else if (browser.equalsIgnoreCase("safari")) {
			dr= new SafariDriver();
		}
		else if (browser.equalsIgnoreCase("edge")) {
			dr= new EdgeDriver();
		}
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		dr.get(url);
	}
//	@BeforeMethod
//	public void login() throws IOException {
//		
//		String username=ReadFromPropertiesFile.propertiesFile("username");
//		String password = ReadFromPropertiesFile.propertiesFile("password");
//		WebElement username_field = dr.findElement(By.name("username"));
//		username_field.sendKeys(username);
//		
//		WebElement password_field = dr.findElement(By.name("password"));
//		password_field.sendKeys(password);
//		dr.findElement(By.xpath("//button[@type='submit']")).click();
//	}
//	@AfterMethod
//	public void logout() {
//		dr.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
//		dr.findElement(By.linkText("Logout")).click();
//	}
	@AfterClass
	public void PostCondition() {
		dr.quit();
	}
}
