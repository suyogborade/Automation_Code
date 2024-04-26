package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Methods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();

		Thread.sleep(5000);

		driver.close();

		Thread.sleep(5000);

		driver.quit();
	}

}
