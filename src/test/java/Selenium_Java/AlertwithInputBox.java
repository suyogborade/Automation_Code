package Selenium_Java;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertwithInputBox {

	public static void main(String[] args) {

		WebDriver driver = new SafariDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");

		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();

		driver.findElement(By.xpath("//button[normalize-space()='click the button to demonstrate the prompt box']"))
				.click();

		// direct close and click without
		// driver.switchTo().alert().accept();

		Alert input = wait.until(ExpectedConditions.alertIsPresent());

		input.sendKeys("Selenium Automation By Suyog");
		input.accept();
		System.out.println(input.getText());

		driver.close();
	}

}
