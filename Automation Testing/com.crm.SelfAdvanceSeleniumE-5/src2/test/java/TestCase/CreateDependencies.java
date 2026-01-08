package TestCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateDependencies {

	@Test(priority = 1)
	public void createAcc() throws Exception {
		System.out.println("iam create account");
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		dr.get("https://www.mumbaiindians.com/");
		dr.close();
		//throw new Exception("Account is not created");
	}
	
	@Test(priority=2, dependsOnMethods = "createAcc")
	public void updateAcc() {
		System.out.println("iam update account");
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		dr.get("https://www.chennaisuperkings.com/");
		dr.close();
	}
	
	@Test(priority=3, dependsOnMethods = "createAcc")
	public void deleteAcc() {
		System.out.println("iam delete account");
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		dr.get("https://www.royalchallengers.com/");
		dr.close();
	}
	
}
