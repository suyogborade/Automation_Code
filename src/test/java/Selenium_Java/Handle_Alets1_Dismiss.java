package Selenium_Java;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handle_Alets1_Dismiss {

	public static void main(String[] args) {

		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Alerts.html");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.findElement(By.xpath("//button[contains(@class,'btn btn-danger')]")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		// direct close the pop up window
		// driver.switchTo().alert().dismiss();

		Alert alterwin = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alterwin.getText());
		alterwin.dismiss();

	}

}
