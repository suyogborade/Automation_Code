package Selenium_Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownwith_SelectTag {

	public static void main(String[] args) {
		
		WebDriver driver = new SafariDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
	
		WebElement click =driver.findElement(By.cssSelector("#Skills"));
		//click.click();
		
		Select drop = new Select(click);
		
		drop.selectByVisibleText("Software");
		
		drop.selectByIndex(5);
		
		List<WebElement> list = drop.getOptions();
		System.out.println(list.size());
		
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
		}
		
		System.out.println("--------------------------------");
		
		for(WebElement option:list) {
		System.out.println(option.getText());
		
		}
		
		
		
		
		
		
		
		

	}

}
