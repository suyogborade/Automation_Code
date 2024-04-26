package Selenium_Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class AssignmentWithoutSelect_Class {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new SafariDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
	
		driver.findElement(By.cssSelector("#country-list")).click();
		
		List<WebElement> country= driver.findElements(By.xpath("//select[@name='country']//option"));
		System.out.println("Total Country :" + country.size());
		
		for(int i=0; i<country.size();i ++) {
			
			if(country.get(i).getText().equals("India")) {
				
				country.get(i).click();
			}
		
			System.out.println("Country : " + country.get(i).getText());
		}
		
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("select#state-list")).click();
		
		List<WebElement> states=driver.findElements(By.xpath("//*[@id=\"state-list\"]//option"));
	
		System.out.println(states.size());
		
		for(int i=0; i<states.size(); i++) {
			
			if(states.get(i).getText().equals("Delhi")) {
				states.get(i).click();
				
			}
			
			System.out.println("State :" + states.get(i).getText());
		}
	
		
	}

}
