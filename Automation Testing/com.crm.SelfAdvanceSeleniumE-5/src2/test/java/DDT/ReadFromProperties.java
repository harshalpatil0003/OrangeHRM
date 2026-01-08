package DDT;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ReadFromProperties {
public static WebDriver dr=null;
	@Test
	public static void main() throws IOException {
		Properties prop = new Properties();
		FileInputStream instr= new FileInputStream(".\\src\\test\\resources\\Configuration.properties");
		prop.load(instr);
		String browser=prop.getProperty("browser");
		String url=prop.getProperty("url");
		String username=prop.getProperty("username");
		String password=prop.getProperty("password");
		
		if (browser.equals("chrome")) {
			dr= new ChromeDriver();
		} else if(browser.equals("edge")){
			dr= new EdgeDriver();
		}else if(browser.equals("firefox")){
			dr= new EdgeDriver();
		}else {
			dr= new ChromeDriver();
		}
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		dr.get(url);
		dr.findElement(By.name("username")).sendKeys(username);
		dr.findElement(By.name("password")).sendKeys(password);
		dr.findElement(By.xpath("//button[text()=' Login ']")).click();
	}
}
