package HW17;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import UtilityClass.BaseClass;
public class Omayo extends BaseClass{

	public static void main(String[] args) throws Exception {
		
		preCondition("chrome", "https://omayo.blogspot.com/");
		
		WebDriverWait wait= new WebDriverWait(dr, Duration.ofSeconds(30));
		
		Actions act= new Actions(dr);
		
		act.scrollToElement(dr.findElement(By.id("delayedText"))).perform();
		
		//dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("delayedText")));
		String text= dr.findElement(By.id("delayedText")).getText();
		System.out.println(text);
		
		dr.navigate().refresh();
		
		try {
			act.scrollToElement(dr.findElement(By.id("timerButton"))).perform();
		
			wait.until(ExpectedConditions.elementToBeClickable(By.id("timerButton")));
			dr.findElement(By.id("timerButton")).click();
			Alert alt= dr.switchTo().alert();
			alt.accept();
			System.out.println("PopUp is handled");
		}
		catch(Exception e) {
			postCondition();
			throw new Exception("Unable to handle popup");
		}
		dr.quit();
	}
}
