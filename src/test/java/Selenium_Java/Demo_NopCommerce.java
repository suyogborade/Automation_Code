package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class Demo_NopCommerce {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new SafariDriver();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.id("Email"));
		email.clear();
		email.sendKeys("admin@yourstore.com\n");

		WebElement pass = driver.findElement(By.id("Password"));
		pass.clear();
		pass.sendKeys("admin");

		Thread.sleep(5000);

		String act_res = driver.getTitle();
		String exp_res = "nopcommerce";

		if (act_res.equals(exp_res)) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Fail");
		}
		Thread.sleep(5000);

		driver.quit();
	}

}
