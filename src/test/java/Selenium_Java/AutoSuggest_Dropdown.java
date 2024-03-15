package Selenium_Java;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggest_Dropdown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.cssSelector("#APjFqb")).sendKeys("Selenium");
		
		List<WebElement> list = driver.findElements(By.xpath("//div[contains(@class,'wM6W7d')]//span"));
		
		System.out.println("Number of Suggestion " + list.size());
		
		for(int i=0; i<list.size(); i++) 
		{
			String text=list.get(i).getText();
			
			if(text.equals("selenium tutorial")) {
				list.get(i).click();
				break;
			}
			
			System.out.println(list.get(i).getText());
			
			
		}

		
		driver.close();
		

	}

}
