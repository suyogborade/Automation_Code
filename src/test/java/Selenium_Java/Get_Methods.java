package Selenium_Java;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Get_Methods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");                                                                     
		driver.manage().window().maximize();
		
		System.out.println("Title of the Page: " + driver.getTitle());
		
		System.out.println("Current URL: " + driver.getCurrentUrl());
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set<String>  windowids =driver.getWindowHandles();
		
		for(String winid:windowids) {
			System.out.println(winid);
			
		}
	}

}
