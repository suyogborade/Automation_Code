package Selenium_Practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindows {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.partialLinkText("OrangeHRM, Inc")).click();
		
		Set<String> windowIds = driver.getWindowHandles();
		
		for(String winId : windowIds) {
			String title  =driver.switchTo().window(winId).getTitle();
			
			if(title.equals("Human Resources Management Software | OrangeHRM")) 
			{
				driver.findElement(By.partialLinkText("Contact Sales")).click();
				driver.close();
			}
			
			if(title.equals("OrangeHRM")) {
				driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
				
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
				
				driver.findElement(By.cssSelector(".oxd-button ")).click();
				
				driver.close();
			}
		}
		
		
	}

}
