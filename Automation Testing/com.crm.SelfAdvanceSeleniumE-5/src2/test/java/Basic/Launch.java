package Basic;
import java.time.Duration;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	@Test(priority = 3,invocationCount = 0, threadPoolSize =3, enabled = true)
	public void A3(){
		WebDriver dr= new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		dr.get("https://www.chennaisuperkings.com/");
		
	}
	@Test(priority=2)
	public void A1() {
		WebDriver dr= new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		dr.get("https://ww=w.royalchallengers.com/");
	}
	@Test(priority=1)
	public void A2() {
		WebDriver dr= new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		dr.get("https://www.mumbaiindians.com/");
	}
	
}
