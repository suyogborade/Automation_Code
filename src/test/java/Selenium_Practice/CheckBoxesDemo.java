package Selenium_Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;


public class CheckBoxesDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new SafariDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		

		List<WebElement> drp = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for(int i=1; i<drp.size(); i++)
		{ drp.get(i).click();
		
		}
		
		Thread.sleep(5000);
		
		for(WebElement sel:drp) {
			if (sel.isSelected()) {
				sel.click();
				}
		}
		
		}

	}


