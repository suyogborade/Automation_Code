package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditonal_Commands {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();

		// isDisplayed and isEnabled
		WebElement Logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println("Status of the Logo: " + Logo.isDisplayed());

		WebElement sarchbox = driver.findElement(By.cssSelector("input#small-searchterms"));

		System.out.println("Display Status: " + sarchbox.isDisplayed());
		System.out.println("Enabled Status: " + sarchbox.isEnabled());

		WebElement radiobtn = driver.findElement(By.cssSelector("#gender-male"));
		radiobtn.click();
		System.out.println(radiobtn.isSelected());

		driver.quit();
	}

}
