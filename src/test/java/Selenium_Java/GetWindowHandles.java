package Selenium_Java;

import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetWindowHandles {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.partialLinkText("OrangeHRM, Inc")).click();
		
		
		Set<String> windowIDs = driver.getWindowHandles(); //Store window IDs
		
		List<String> winList = new ArrayList<String>(windowIDs);
		
		String parentID= winList.get(0);
		String childID=winList.get(1);
		
		driver.switchTo().window(childID);
		
		driver.findElement(By.partialLinkText("Contact Sales")).click();
		
		driver.switchTo().window(parentID);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin123");
		
		driver.findElement(By.cssSelector(".oxd-button ")).click();
		
		driver.quit();
		
	}

}
