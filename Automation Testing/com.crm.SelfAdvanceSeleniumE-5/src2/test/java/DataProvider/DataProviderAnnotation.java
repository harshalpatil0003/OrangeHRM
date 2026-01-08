package DataProvider;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotation {

	@DataProvider(name="user")
	public Object[][] sender() throws EncryptedDocumentException, IOException {
	
		
		FileInputStream instr= new FileInputStream(".\\src\\main\\resources\\Username.xlsx");
		Workbook wb=WorkbookFactory.create(instr);
		Sheet sh= wb.getSheet("Username");
		int row= sh.getPhysicalNumberOfRows();
		int col= sh.getRow(0).getPhysicalNumberOfCells();
		Object[][] obj= new Object[row][col];
		
		for (int i = 0,j=0; i < row; i++) {
			obj[i][j]=sh.getRow(i).getCell(j).toString();
		}
		return obj;
	}
	
	@Test(dataProvider = "user")
	public void receiver(String username) throws InterruptedException {
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		dr.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(2000);
		dr.close();
		Thread.sleep(2000);
	}
	
}
