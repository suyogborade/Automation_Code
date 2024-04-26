package Selenium_Practice;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AletsHandle {

	public static void main(String[] args) {
		
		WebDriver driver  = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		Alert pop = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(pop.getText());
		
		
		String acttext=pop.getText();
		String exptext="Please enter a valid user name";
		
		if(acttext.equals(exptext)) {
			
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Fail");
		}
		pop.accept();
		
		driver.close();
		
	}

}
