package Selenium_Java;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataExcel {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+ "/testData/myfile1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet();
		
		/*
		XSSFRow row1 = sheet.createRow(0);
		
		row1.createCell(0).setCellValue("Automation");
		row1.createCell(1).setCellValue("Selenium Java");
		row1.createCell(2).setCellValue("Jmeter Load ");
		
		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("QA Lead");
		row2.createCell(1).setCellValue("QA Engineer");
		row2.createCell(2).setCellValue("Quality Analyst");
		
		*/
		
		//Creating rows, cloumns by using Loop
		
		Scanner sc = new Scanner(System.in);
		
		for(int r=0; r<=4; r++) 
		{
			XSSFRow currentrow = sheet.createRow(r);
			
			for(int c=0; c<3; c++)
			{
				System.out.println("Enter Value : ");
			 String	value = sc.next();
			 
			 currentrow.createCell(c).setCellValue(value);
			}
		}
		
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("Writing is Done");

	}

}
