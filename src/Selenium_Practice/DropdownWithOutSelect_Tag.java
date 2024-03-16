package Selenium_Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;



public class DropdownWithOutSelect_Tag {

	public static void main(String[] args) {
		WebDriver driver = new SafariDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button")).click();
	
		
		List<WebElement> dropdown = driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//label"));
		
		System.out.println("Total number of checkboxes: " + dropdown.size());
		
		/* for(int i=0; i<dropdown.size(); i++) {
			System.out.println(dropdown.get(i).getText()); 
		}  */

//		for(int i=0; i<dropdown.size(); i++) {
//			
//			String option=dropdown.get(i).getText();
//			
//			if(option.equals("Java") || option.equals("Phyton"))
//			{
//				dropdown.get(i).click();
//				
//			}
//		}

		for(WebElement option:dropdown) {
			if(option.equals("Java") || option.equals("Oracle"))
			{
				option.click();
				break;
			}
		}
		
		
		
		
		
//		for(WebElement ele:dropdown) {
//			if(ele.isEnabled()) {
//				ele.click();
//			}
//		}
//		
		
		
		
		
		
		
		
	}

}
