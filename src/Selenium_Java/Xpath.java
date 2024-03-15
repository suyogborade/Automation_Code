package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;


public class Xpath {

	public static void main(String[] args) {
		
		SafariDriver driver = new SafariDriver();
		
		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();
		
		WebElement ele =driver.findElement(By.xpath("//a[text()='MacBook']"));
		System.out.println(ele.getText());
		
		driver.quit();

	}

}
