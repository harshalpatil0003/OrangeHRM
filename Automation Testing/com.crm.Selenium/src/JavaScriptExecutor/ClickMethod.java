package JavaScriptExecutor;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import UtilityClass.BaseClass;
public class ClickMethod extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		preCondition("chrome", "https://www.oracle.com/in/java/technologies/downloads/");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement version = dr.findElement(By.linkText("jdk-17.0.17_linux-aarch64_bin.tar.gz"));
		JavascriptExecutor js= (JavascriptExecutor) dr;
		js.executeScript("arguments[0].scrollIntoView(false);", version);
		Thread.sleep(2000);
		version.click();
		
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", dr.findElement(By.linkText("Download jdk-17.0.17_linux-aarch64_bin.tar.gz")));
		
		Thread.sleep(2000);
		postCondition();
	}
}
