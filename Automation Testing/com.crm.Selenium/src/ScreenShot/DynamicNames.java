package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import UtilityClass.BaseClass;

public class DunamicNames extends BaseClass{

	public static void main(String[] args) throws InterruptedException, IOException {
		
		preCondition("chrome", "https://demowebshop.tricentis.com/");
		
		String name="dwspagws";
		LocalDateTime date = LocalDateTime.now();
		String time= date.toString().replace(":", "-");
		String fileName=name+time;
		System.out.println(fileName);
		
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		TakesScreenshot ts=(TakesScreenshot) dr;
		File from =ts.getScreenshotAs(OutputType.FILE);
		File to= new File("C:\\Users\\harsh\\Documents\\SeleniumScreenShot\\"+fileName+".png");
		FileHandler.copy(from, to);
		postCondition();
		
	}
}
