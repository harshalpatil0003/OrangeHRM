package DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadFromExcelFile {

	@Test
	public static void main() throws EncryptedDocumentException, IOException {
		
		FileInputStream instr= new FileInputStream(".\\src\\main\\resources\\URL Shortener Defect Report.xlsx") ;
		Workbook wb = WorkbookFactory.create(instr);
		Sheet sh= wb.getSheet("URL Shortene");
		System.out.println(sh);
		String data=sh.getRow(0).getCell(0).toString();
		String data1=sh.getRow(1).getCell(0).toString();
		String data2=sh.getRow(2).getCell(0).toString();
		String data3=sh.getRow(3).getCell(0).toString();
		
		System.out.println(data);
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
	}
}
