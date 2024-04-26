package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CssSelector_Xpath {

	public static void main(String[] args) {
		WebDriver driver = new SafariDriver();

		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

		// CssSelector xpath by using tag#id
		// driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Macbook");

		// Css selector with Id
		// driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Macbook
		// Pro");

		// Tag with class
		// driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Macbook
		// Pro");

		// tag and attribute
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Macbook Pro 13");

	}

}
