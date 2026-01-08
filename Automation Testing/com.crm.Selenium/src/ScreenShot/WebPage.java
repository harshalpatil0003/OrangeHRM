package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import UtilityClass.BaseClass;

public class WebPage  extends BaseClass{

	public static void main(String[] args) throws InterruptedException, IOException {
		preCondition("chrome", "https://demoapps.qspiders.com/");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		TakesScreenshot ts= (TakesScreenshot) dr;
		File from=ts.getScreenshotAs(OutputType.FILE);
		File to =new File("C:\\Users\\harsh\\Documents\\SeleniumScreenShot\\Home.png");
		FileHandler.copy(from, to);
		
	}
}
