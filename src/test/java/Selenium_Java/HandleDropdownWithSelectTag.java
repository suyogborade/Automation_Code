package Selenium_Java;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdownWithSelectTag {

	public static void main(String[] args) {
		WebDriver driver = new SafariDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().window().maximize();

		WebElement drpcuntry = driver.findElement(By.xpath("(//select)[1]"));

		Select drpselect = new Select(drpcuntry);

		// Selecting value from dropdown
		drpselect.selectByVisibleText("India");
		drpselect.selectByIndex(3);

		// Find Total options from the Dropdown
		List<WebElement> Options = drpselect.getOptions();
		System.out.println("Total no. of Options: " + Options.size());

		// Print Options in Console Window

//		for(int i=0; i<Options.size(); i++) {
//			
//		System.out.println(Options.get(i).getText());
//			
//		}

		for (WebElement drop : Options) {
			System.out.println(drop.getText());
		}

		driver.close();

	}

}
