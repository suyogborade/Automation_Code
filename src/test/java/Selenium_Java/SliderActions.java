package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderActions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		//minimum slider
		WebElement min_Slide =  driver.findElement(By.xpath("//span[1]"));
		System.out.println("Original Location " + min_Slide.getLocation());
		act.dragAndDropBy(min_Slide, 100, 250).perform();
		System.out.println("Slider Location " + min_Slide.getLocation() );

		//maximum slider
		WebElement max_Slider = driver.findElement(By.xpath("//span[2]"));
		System.out.println("Original Location " + max_Slider.getLocation());
		act.dragAndDropBy(max_Slider, -81, 250).build().perform();
		System.out.println("Slider Location " + max_Slider.getLocation() );

		
		
		
	}

}
