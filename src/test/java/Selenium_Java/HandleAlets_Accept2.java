package Selenium_Java;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlets_Accept2 {

	public static void main(String[] args) {
		
		WebDriver driver = new SafariDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[contains(@class,'analystic') and @href='#CancelTab']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		Alert altwin = wait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println(altwin.getText());
		//altwin.accept();
		altwin.dismiss();
	}

}
