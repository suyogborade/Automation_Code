package Selenium_Java;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class Dropdown_WithoutSelectTag {

	public static void main(String[] args) {
		WebDriver driver = new SafariDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();

		// clicking on the dropdown
		driver.findElement(By.xpath("//button[@type='button']")).click();

		List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));

		System.out.println("Total Number of Options :" + options.size());

		// print all the dropdown
		for (int i = 0; i < options.size(); i++) {
			System.out.println(options.get(i).getText());
		}

		System.out.println("-----------------------------");

		for (WebElement drop : options) {
			System.out.println(drop.getText());
		}
	}

}
