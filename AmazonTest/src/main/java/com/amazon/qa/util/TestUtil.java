package com.amazon.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.model.Sheet;
import org.apache.poi.hssf.model.Workbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.amazon.qa.base.TestBase;

public class TestUtil extends TestBase {

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 10;
	public static String TESTDATA_SHEET_PATH="/AmazonTest/src/main/java/com/amazon/qa/testdata/Amazon_address_Testdata.xlsx";
	static org.apache.poi.ss.usermodel.Workbook book;
	static org.apache.poi.ss.usermodel.Sheet sheet;
	/*
	public TestUtil() {
		XSSFWorkbook wbook;
		try {
			wbook = new XSSFWorkbook(TESTDATA_SHEET_PATH);
			XSSFSheet sheet=wbook.getSheetAt(0);
			XSSFRow row= sheet.getRow(1);
			XSSFCell cell= row.getCell(0);
			String value= cell.getStringCellValue();
			System.out.println(value);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	*/
	
	
	
	
	
	
	
	
	
	
	
	//if any element oresent inside a frame we can use this common method
	public void SwitchToFrame() {
		driver.switchTo().frame("mainpanel");
	}
	
	public static Object[][] getTestData(String sheetName){
		FileInputStream file=null;
		try {
			file=new FileInputStream(TESTDATA_SHEET_PATH);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		try {
			book=WorkbookFactory.create(file);
		}
			catch(IOException e) {
			e.printStackTrace();
		}
		
		sheet= book.getSheet(sheetName);
		Object[][]  data= new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for (int i=0; i<sheet.getLastRowNum(); i++) {
			for (int j=0; j<sheet.getRow(0).getLastCellNum(); j++) {
			data[i][j]=sheet.getRow(i+1).getCell(j).toString();
		
		}
		
		}
		return data;
	
	}
}
	
	

