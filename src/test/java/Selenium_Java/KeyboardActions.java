package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
		

		WebDriver driver  = new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Welcome To Automation ");
		
		Actions act = new Actions(driver);
		
		// clt + a
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		
		
		
	}

}
