package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
 

public class CheckBoxes {

	public static void main(String[] args) {
		
		WebDriver driver = new SafariDriver();
		
		driver.get("https://www.globalsqa.com/samplepagetest/");
		driver.manage().window().maximize();
		
		
		
		List<WebElement> exp =driver.findElements(By.xpath("//input[@type='checkbox'and @class='checkbox-multiple']"));
		
		System.out.println("Total no. of the Checkboxes : " + exp.size());
		
	
		for(int i=1; i<exp.size(); i++) {
			exp.get(i).click();
			System.out.println(exp.get(i));
		}
		
		
//		for(WebElement drop:exp) {
//			drop.click();
//			System.out.println(drop.getText());
//		}
		
		for(WebElement drp:exp) {
			if(drp.isSelected()) {
				drp.click();
			}
		}
	}

}
