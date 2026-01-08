package TestCases;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import UtilityClass.BaseClass;

public class RegisterFacebook extends BaseClass{

	public static void main(String[] args) throws Exception {
		
		
		String expected_URL="https://demowebshop.tricentis.com/";
		String facebook="https://www.facebook.com/nopCommerce";
		
		preCondition("chrome", "https://demowebshop.tricentis.com/");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		if (expected_URL.equals(dr.getCurrentUrl())) {
			
			//login();
			Actions act= new Actions(dr);
			act.scrollToElement(dr.findElement(By.className("footer-disclaimer"))).perform();
			
			List<WebElement> links= dr.findElements(By.xpath("//a[@target='_blank']"));
		
			Thread.sleep(1000);
			for (WebElement web : links) {
				web.click();
				Thread.sleep(1000);
			}
			Set<String> handles= dr.getWindowHandles();
			for (String str: handles) {
				dr.switchTo().window(str);
	
				Thread.sleep(2000);
				if(dr.getCurrentUrl().equals(facebook)) {
					Thread.sleep(3000);
					dr.findElement(By.xpath("//span[text()='Create new account']")).click();
					Thread.sleep(2000);
					dr.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]")).sendKeys("Harshal");
					Thread.sleep(2000);
					dr.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]")).sendKeys("Patil");
					Thread.sleep(2000);
					dr.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[5]")).sendKeys("8767887013");
					Thread.sleep(2000);
					dr.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[7]")).sendKeys("123456");
					
					//List <WebElement> date=dr.findElements(By.xpath("//span/select"));
					WebElement day = dr.findElement(By.id("day"));
					Select s= new Select(day);
					s.selectByVisibleText("15");
					
				} 
				Thread.sleep(1000);
			}
			
			System.out.println("Landed to right page");
		}else {
			postCondition();
			throw new Exception("Landed into wrong page");
		}
		postCondition();
	}
}
