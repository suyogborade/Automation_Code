package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorTextDemo {

	public static void main(String[] args) {
		
		WebDriver driver  = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement inputbox=  driver.findElement(By.cssSelector("input#name"));

		JavascriptExecutor js = (JavascriptExecutor) driver; // typcasting to use the javascriptexecutor
		
		//JavascriptExecutor js1 = driver;  // when we directly use chromedriver class 
		
		js.executeScript("arguments[0].setAttribute('value', 'Suyog')", inputbox);
		
		
		WebElement radiobtn = driver.findElement(By.cssSelector("#male"));
		
		js.executeScript("arguments[0].click();", radiobtn);
		
		
	}

}
