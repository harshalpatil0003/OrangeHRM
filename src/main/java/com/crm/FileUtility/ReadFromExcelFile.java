package com.crm.FileUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcelFile {
	public static String ReadExcel(int row, int col, String sheet) throws EncryptedDocumentException, IOException {
		FileInputStream instr= new FileInputStream(".\\src\\test\\resources\\TestData\\TestData.xlsx");
		Workbook book= WorkbookFactory.create(instr);
		Sheet sh = book.getSheet(sheet);
		return sh.getRow(row).getCell(col).toString();
	}
}
