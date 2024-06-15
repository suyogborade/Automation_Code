package Selenium_Java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorScrolling {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//1)Scroll down the page by pixel number
		//js.executeScript("window.scrollBy(0,1600)", "");
		//System.out.println(js.executeScript("return window.pageYOffset; "));

		//2) scroll till the element is visible
		/* WebElement logo = driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
		js.executeScript("arguments[0].scrollIntoView();", logo);
		System.out.println(js.executeScript("return window.pageYOffset;"));  */
		
		//3) scroll till the end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//4) scroll upto initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
	}

}
