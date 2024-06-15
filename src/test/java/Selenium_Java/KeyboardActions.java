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
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		
		// clt + c
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		
		//Tab key
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		//clt + v 
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform(); 		
		
	}

}
