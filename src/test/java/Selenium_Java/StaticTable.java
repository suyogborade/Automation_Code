package Selenium_Java;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StaticTable {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Approach 1 to calculate total no of rows by findelEments
		List<WebElement>  rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		int row = rows.size();
		
		System.out.println("Total number of Rows : " + rows.size());
		
		
		//Approach 2 by using tag name recommended when only 1 table on page 
		//driver.findElements(By.tagName("tr")); 
		
		for(WebElement totalrows : rows)
		{
			System.out.println(totalrows.getText());
		}
		System.out.println();
			
		//find total number of columns
		
		List<WebElement> columns = driver.findElements(By.xpath("(//tr)[1]//th"));
		System.out.println("Totoal number of Columns : " + columns.size());
		int colm=columns.size();
		
		for(WebElement col : columns)
		{
			System.out.println(col.getText());
		}
		
		System.out.println();
		
		//Read specific row and column data
		
		String specrow = driver.findElement(By.xpath("(//table[@name='BookTable'])//tr[5]//td[1]")).getText();
		System.out.println("Specific Rows of Table : " + specrow);
		
		String specCol = driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]//td[3]")).getText();
		System.out.println("Specific Column of Table : " +specCol);
		
		System.out.println();
		
		//Read all data from rows and column
		
		for(int r=2; r<=row; r++) //r starting from 2 becoz on first row td tag is not available
		{
			for(int c=1; c<=colm; c++) 
			{
				String totalData = driver.findElement(By.xpath("(//table[@name='BookTable'])//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(totalData + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		//Find sum of prices for all Books
		int sum=0;
		for(int r=2; r<=row; r++) 
		{
			String price = driver.findElement(By.xpath("(//table[@name='BookTable'])//tr["+r+"]//td["+4+"]")).getText();
			sum =sum+Integer.parseInt(price);
		}
		System.out.println("Total Price of Books : " + sum);
		
		driver.quit();
		
	}

}
