package Basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DemoForm {

	@Test
	public static void main() throws InterruptedException {
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		dr.get("https://demo.automationtesting.in/Register.html");
		
		List<WebElement> inputs = dr.findElements(By.xpath("//input[contains(@class,'form-control')]"));
		for (int i = 0; i <= inputs.size(); i++) {
			
			if (i==0) {
				inputs.get(i).sendKeys("Harshal");
			} 
			else if (i==1) {
				inputs.get(i).sendKeys("Patil");
			}
			else if (i==2) {
				inputs.get(i).sendKeys("harsh@gmail.com");
			}
			else if (i==3) {
				inputs.get(i).sendKeys("8767887013");
			}
			else if (i==4) {
				inputs.get(i).sendKeys("123456");
			}
			else if (i==5) {
				inputs.get(i).sendKeys("123456");
			}
		}
		Thread.sleep(1000);
		//dr.findElement(By.tagName("//textarea[@ng-model='Adress']")).sendKeys("Pune");
		dr.findElement(By.xpath("//input[@value='Male']")).click();
		
		List<WebElement> hobbies = dr.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement web : hobbies) {
			web.click();
		}
		
		Select sel= new Select(dr.findElement(By.id("Skills")));
//		sel.selectByVisibleText("English");
//		sel.selectByVisibleText("Hindi");
		
//		WebElement lang = dr.findElement(By.id("msdd"));
//		lang.sendKeys("English");
//		lang.sendKeys("Hindi");
		
		sel.selectByVisibleText("Java");
		
//		Select sel2 = new Select(dr.findElement(By.id("countries")));
//		sel2.selectByVisibleText("India");
		
		dr.findElement(By.xpath("//span[contains(@class,'select2-selection')]")).click();
		Thread.sleep(1000);
		dr.findElement(By.xpath("//li[text()='India']")).click();
		Select year= new Select(dr.findElement(By.id("yearbox")));
		year.selectByVisibleText("2003");
		
		Select mon= new Select(dr.findElement(By.xpath("//select[@placeholder='Month']")));
		mon.selectByVisibleText("March");
		
		Select day= new Select(dr.findElement(By.id("daybox")));
		day.selectByVisibleText("15");
		
		dr.findElement(By.id("imagesrc")).sendKeys("C:\\Users\\harsh\\Documents\\SeleniumScreenShot\\giftcard.jpeg");
		
		
		
		
		
	}
}
