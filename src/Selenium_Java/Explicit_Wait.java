package Selenium_Java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");                                                                    
		driver.manage().window().maximize();
		
		driver.navigate().refresh();
		WebElement userName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		userName.sendKeys("Admin");
		
		//driver.findElement(By.name("username")).sendKeys("Admin");
		
		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		password.sendKeys("admin123");
		
		//driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.close();

	}

}
