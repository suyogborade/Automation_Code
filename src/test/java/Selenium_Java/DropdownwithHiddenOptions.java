package Selenium_Java;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownwithHiddenOptions {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.findElement(By.name("username")).sendKeys("Admin");

		driver.findElement(By.name("password")).sendKeys("admin123");

		driver.findElement(By.cssSelector(".oxd-form-actions")).submit();

		driver.findElement(By.xpath("//span[text()='PIM']")).click();

		driver.findElement(By.xpath("(//i[contains(@class, oxd-select-text--arrow)])[10]")).click();

		List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']//span"));

		for (WebElement op : options) {
			if (op.getText().equals("QA Engineer")) {
				op.click();
				break;
			}
			System.out.println(op.getText());
		}

	}

}
