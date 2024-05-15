package Selenium_Java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationOfElement {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));
		
		System.out.println(" minimize  " + logo.getLocation());
		
		driver.manage().window().maximize();
		System.out.println("After Miximize  " + logo.getLocation());
		
		driver.manage().window().fullscreen();
		System.out.println("After Fullscreen  " + logo.getLocation());
		
		Point p =new Point(200, 200);
		
		driver.manage().window().setPosition(p);
		
		System.out.println("After setting 200*200 size  " + logo.getLocation());
		
		p =new Point(50,50);
		
		driver.manage().window().setPosition(p);
		
		System.out.println("After setting 50*50 window size  " + logo.getLocation());
	}

}
