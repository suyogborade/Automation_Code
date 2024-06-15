package Selenium_Java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new SafariDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.findElement(By.name("username")).sendKeys("Admin");

		driver.findElement(By.name("password")).sendKeys("admin123");

		driver.findElement(By.xpath("//button[text()=' Login '] ")).click();

		

		String act_res = driver.getTitle();
		String exp_res = "OrangeHRM";

		if (act_res.equals(exp_res)) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Fail");

		}

		driver.quit();

	}

}
