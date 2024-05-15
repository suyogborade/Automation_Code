package Selenium_Java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class Locators {

	public static void main(String[] args) {

		WebDriver driver = new SafariDriver();

		driver.get("https://www.automationexercise.com/");
		driver.manage().window().maximize();

		List<WebElement> img = driver.findElements(By.tagName("img"));

		System.out.println("Number of Images on the Page : " + img.size());

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("Number of Links : " + links.size());

		driver.quit();

	}

}
