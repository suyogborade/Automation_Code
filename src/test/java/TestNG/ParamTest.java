package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.Assert;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


public class ParamTest {

	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser", "url"})
	void setup(String br , String url)
	{
		if(br.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		
		else if(br.equals("firefox"))
		{
			driver = new FirefoxDriver() ;
		}	
		
		else
		{
			driver= new SafariDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	@Test(priority=1)
	void testlogo()
	{
		try 
		{
		boolean status =driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status, true);
		}
		
		catch(Exception e)
		{
			Assert.fail();
		}
	}
	
	@Test
	void testhomepagelogo()
	{
		Assert.assertEquals(driver.getTitle(), "OrangeHRM", "Title not Same");
	}
	
	@AfterClass
	void closeapp() 
	{
		driver.quit();
	}
}
