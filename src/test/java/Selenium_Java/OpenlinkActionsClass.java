package Selenium_Java;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenlinkActionsClass {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement reglink = driver.findElement(By.xpath("//a[text()='Register']"));
		
		Actions act = new Actions(driver);
		
		//CLT + reglink click
		act.keyDown(Keys.CONTROL).click(reglink).keyDown(Keys.CONTROL).perform();
		
		List<String> ids=new ArrayList<String> (driver.getWindowHandles());
		
		driver.switchTo().window(ids.get(1));
		
		driver.findElement(By.id("FirstName")).sendKeys("Suyog");
		
		driver.switchTo().window(ids.get(0));
		
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Macbook Pro");
	}

}
