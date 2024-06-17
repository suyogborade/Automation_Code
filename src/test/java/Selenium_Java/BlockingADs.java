package Selenium_Java;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BlockingADs {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		File file = new File("/Users/suyogborade/Downloads//Adblock-Plus-free-ad-blocker.crx");
		
		options.addExtensions(file);
		
		WebDriver driver  = new ChromeDriver(options);
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Welcome To Automation ");

	}

}
