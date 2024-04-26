package Selenium_Java;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandleiFrames {

	public static void main(String[] args) throws InterruptedException {
			
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement frm1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frm1);
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("first frame Done");
			
		driver.switchTo().defaultContent();
		
		WebElement frm2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frm2);
		
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Second frame Done");
		
		driver.switchTo().defaultContent();
		
		WebElement frm4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frm4);
		
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Fourth frame Done");
		
		driver.switchTo().defaultContent();
		
		WebElement frm5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frm5);
		
		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Fifth frame Done");
		
		driver.switchTo().defaultContent();
		
		WebElement frm3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frm3);
		
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Third frame Done");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.cssSelector(".AB7Lab")).click();
		
		driver.findElement(By.xpath("(//span[@class='l4V7wb Fxmcue'])[2]")).click();
		
		WebElement text = driver.findElement(By.cssSelector(".KHxj8b"));
		js.executeScript("arguments[0].scrollIntoView();", text);
	
		text.sendKeys("Selenium is an open-source, automated testing tool used to test web applications across various browsers.");
		text.click();
		
		//Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
		
		driver.close();
		
		
		
		
		
	}

}
