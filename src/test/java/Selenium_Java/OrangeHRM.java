package Selenium_Java;

import org.openqa.selenium.safari.SafariDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRM {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new SafariDriver();
		
	
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		                                                                      
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		Thread.sleep(4000);
		
		String act_res = driver.getTitle();
		String exp_res = "OrangeHRM";
		
		if(act_res.equals(exp_res)) {
			System.out.println("Test Pass");
		}
		else {
			System.out.println("Test Fail");
		
		}
		
		driver.quit();

	}

}
