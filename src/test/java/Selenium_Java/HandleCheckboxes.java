package Selenium_Java;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class HandleCheckboxes {

	public static void main(String[] args) {

		WebDriver driver = new SafariDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		// Single checkbox
		// ssssssssdriver.findElement(By.cssSelector("#monday")).click();

		// Multiple checkbox
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox' and @class]"));
		System.out.println("Total number of checkboxes: " + checkboxes.size());

		// Select all checkboxes
		
		  for(int i=0; i<checkboxes.size(); i++){ checkboxes.get(i).click();
		  System.out.println(i); }
		  
		// for each loop 
		  for(WebElement chkbox : checkboxes) { chkbox.click(); }
		 

		/* for (int i = 4; i < checkboxes.size(); i++) {
			checkboxes.get(i).click();
		}

		for (int i = 0; i < 2; i++) {
			checkboxes.get(i).click();
		}
		*/
//		for (int i= 0; i < checkboxes.size(); i++) {
//
//			if (i > 4) {
//				checkboxes.get(i).click();
//			}
//		} 
		
		for(WebElement chkbox : checkboxes) {
			if(chkbox.isSelected()) {
				chkbox.click();
			}
		}

	}

}