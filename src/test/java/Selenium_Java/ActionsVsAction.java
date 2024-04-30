package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsVsAction {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();

		WebElement btn = driver.findElement(By.xpath("(//span[@class='context-menu-one btn btn-neutral'])[1]"));

		Actions act = new Actions(driver);

		Action myaction = act.contextClick(btn).build(); //creating Action and storing it in variable 

		myaction.perform(); //completing action 
		
		
	}

}
