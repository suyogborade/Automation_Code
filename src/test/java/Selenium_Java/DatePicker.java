package Selenium_Java;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.switchTo().frame(0);

		// Approach 1
		// driver.findElement(By.className("hasDatepicker")).sendKeys("07/17/2024");

		// Approach 2
		String year = "2023";
		String month = "May";
		String date = "10";
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();

		while (true) {
			String mon = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String yr = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

			if (mon.equals(month) && yr.equals(year)) {
				break;
			}

			// driver.findElement(By.xpath("//span[@class='ui-icon
			// ui-icon-circle-triangle-e']")).click(); //future data
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); // past date
		}

		List<WebElement> alldate = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));

		/*
		 * for (WebElement dt : alldate) { if (dt.getText().equals(date)) { dt.click();
		 * break; }
		 * 
		 * }
		 */

		for (int i = 0; i < alldate.size(); i++) {
			if (alldate.get(i).getText().equals(date)) {
				alldate.get(i).click();
				break;
			}
		}
		Thread.sleep(2000);
		
		 driver.close();
	}

}
