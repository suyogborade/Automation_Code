package Selenium_Practice;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandleiFrames {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.switchTo().frame("singleframe");

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Frames hee Frames");

		driver.switchTo().defaultContent();

		driver.findElement(By.xpath("//a[contains(text(),'Iframe with')]")).click();

		WebElement ifrm = driver.findElement(By.xpath("//iframe[contains(@src,'MultipleFrames.html')]"));
		driver.switchTo().frame(ifrm);

		WebElement innerifrm = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(innerifrm);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Inner Frame ");

		driver.close();

	}

}
