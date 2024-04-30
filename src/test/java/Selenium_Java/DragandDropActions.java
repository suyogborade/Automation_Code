package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropActions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/packages/dhtml-suite-for-applications/demos/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement rome = driver.findElement(By.xpath("//div[@id='box6']"));
		
		WebElement itly = driver.findElement(By.xpath("(//div[@id='box106'])[1]"));
		
		act.dragAndDrop(rome, itly).perform();
		
		WebElement washinton = driver.findElement(By.xpath("(//div[@id='box3'])[1]"));
		
		WebElement america = driver.findElement(By.xpath("//div[@id='box103']"));
		
		act.dragAndDrop(washinton, america).build().perform();
		
		WebElement oslo = driver.findElement(By.xpath("(//div[@id='box1'])[1]"));
		
		WebElement norway = driver.findElement(By.xpath("(//div[@id='box101'])[1]"));
		
		act.dragAndDrop(oslo, norway).build().perform();
		
		WebElement madrid = driver.findElement(By.xpath("(//div[@id='box7'])[1]"));
		
		WebElement spain = driver.findElement(By.xpath("(//div[@id='box107'])[1]"));
		
		act.dragAndDrop(madrid, spain).build().perform();
		
		WebElement seoul = driver.findElement(By.xpath("(//div[@id='box5'])[1]"));
		
		WebElement southKorea = driver.findElement(By.xpath("(//div[@id='box105'])[1]"));
		
		act.dragAndDrop(seoul, southKorea).build().perform();
		
		WebElement cohagen = driver.findElement(By.xpath("(//div[@id='box4'])[1]"));
		
		WebElement denmark = driver.findElement(By.xpath("//div[@id='box104']"));
		
		act.dragAndDrop(cohagen, denmark).perform();
		
		WebElement stock = driver.findElement(By.xpath("//div[normalize-space()='Stockholm']//div[@id='box2']"));
		
		WebElement sweden = driver.findElement(By.xpath("//div[@id='box102']"));
		
		act.dragAndDrop(stock, sweden).perform();
		
		
		
	}

}
