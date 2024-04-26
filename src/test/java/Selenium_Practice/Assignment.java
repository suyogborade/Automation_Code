package Selenium_Practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Mobile 1
		driver.findElement(By.xpath("//a[contains(text(),'Samsung galaxy s6')]")).click();
		WebElement click = driver.findElement(By.xpath("//a[contains(@class,'btn')]"));
		click.click();

		Alert alt = wait.until(ExpectedConditions.alertIsPresent());
		alt.accept();

		// Homepage
		driver.findElement(By.cssSelector("a#nava")).click();

		// Mobile 2
		driver.findElement(By.xpath("//a[contains(text(),'Iphone 6')]")).click();
		click.click();
		// driver.findElement(By.xpath("//a[contains(@class,'btn')]")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		alt.accept();

		driver.findElement(By.cssSelector("a#nava")).click();

		// Mobile 3
		driver.findElement(By.xpath("//a[contains(text(),'Nexus ')]")).click();
		click.click();
		// driver.findElement(By.xpath("//a[contains(@class,'btn')]")).click();
		// wait.until(ExpectedConditions.alertIsPresent());
		alt.accept();

		driver.findElement(By.cssSelector("a#nava")).click();

		// cart
		driver.findElement(By.id("cartur")).click();

		WebElement text = driver.findElement(By.id("totalp"));
		Thread.sleep(4000);
		String act_price = text.getText();
		System.out.println(text.getText());
		String exp_price = "1800";

		if (act_price.equals(exp_price)) {
			System.out.println("Total is as Expected");
		} else {
			System.out.println("Total is not as Expected");
		}

		driver.findElement(By.xpath("(//a[contains(text(),'Delete')])[1]")).click();

		driver.navigate().refresh();
		Thread.sleep(3000);
		WebElement updateprice = driver.findElement(By.id("totalp"));
		System.out.println("Updated Price " + updateprice.getText());

	}

}
