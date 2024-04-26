package Selenium_Java;

import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.WebDriver;

public class Navigate_Commands {

	public static void main(String[] args) {

		WebDriver driver = new SafariDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://www.amazon.in");
		System.out.println(driver.getCurrentUrl());

		driver.navigate().to("https://www.flipkart.in");
		System.out.println(driver.getCurrentUrl());

		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());

		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());

		driver.navigate().refresh();

		driver.close();

	}

}
