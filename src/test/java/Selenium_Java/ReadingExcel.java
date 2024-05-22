package Selenium_Java;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+  "/testData/data.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		
		XSSFSheet sheet = workbook.getSheet("Sheet1"); // workbook.getSheetAt(0); 
		
		int totalrows = sheet.getLastRowNum();
		
		int totalcells = sheet.getRow(totalrows).getLastCellNum();
		
		System.out.println("Total Number of Rows " + totalrows);
		System.out.println("Total Number of Cells "+ totalcells);
		
		
		for(int i=0; i<=totalrows; i++)
		{
			XSSFRow currentrow = sheet.getRow(i);
			
			for(int c=0; c<totalcells; c++)
			{
			  String value = currentrow.getCell(c).toString();
			  System.out.print(value +  "     ");
			}
			System.out.println();
		}
		
		workbook.close();
		
		file.close();
		
	}

}
