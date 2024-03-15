package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BookMyShow {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new SafariDriver();
		driver.get("https://in.bookmyshow.com/explore/home/national-capital-region-ncr");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[contains(text(),'Hanu-Man')]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[text()='Book tickets']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[normalize-space()='21']")).click();

	}

}
