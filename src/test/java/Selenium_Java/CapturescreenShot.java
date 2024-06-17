package Selenium_Java;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturescreenShot {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		//full page screenshot
	/*	TakesScreenshot ts = (TakesScreenshot) driver ;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"//Screenshots//fullpage.png");
		
		sourcefile.renameTo(targetfile); //copy source file to target file */
		//driver.close();

		//Capture screenshot of the specific section
	/*	WebElement page = driver.findElement(By.cssSelector("div.product-grid"));
		
		File sourceFile = page.getScreenshotAs(OutputType.FILE);
		File targetFile= new File(System.getProperty("user.dir")+ "//Screenshots//specificImg.png");
		sourceFile.renameTo(targetFile);  */
		
		//Capture screenshot of a webElement
		WebElement logo =driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
 
		File sourcFile = logo.getScreenshotAs(OutputType.FILE);
		File targeFile = new File(System.getProperty("user.dir")+ "//Screenshots//logo.png");
		
		sourcFile.renameTo(targeFile);
		
		driver.quit();
	}

}
