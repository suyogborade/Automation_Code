package Selenium_Java;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RightClickAction {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();

		WebElement btn = driver.findElement(By.xpath("(//span[@class='context-menu-one btn btn-neutral'])[1]"));

		Actions act = new Actions(driver);

		act.contextClick(btn).build().perform();

		driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();

		Thread.sleep(4000);

		driver.switchTo().alert().accept();

	}

}
