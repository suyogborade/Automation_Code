 package TestNGListener;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners(TestNGListener.ExtentReportManager.class)
public class NopCommerceExtentsReport {

	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();	
		
	}
	
	@Test(priority=1)
	void testlogo()
	{
		try
		{
	 boolean status =  driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
	 Assert.assertEquals(status, true);
		}
		
		catch(NoSuchElementException e)
		{
			Assert.assertTrue(false);
		}
	}
	
	@Test(priority=2)
	void testlogin() throws InterruptedException 
	{
		try 
		{
		driver.findElement(By.xpath("//a[normalize-space()='Log in']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("suyog@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("demo@123");
		driver.findElement(By.xpath("//button[text()='Log in']")).submit();
		Thread.sleep(3000);
		
		boolean status = driver.findElement(By.linkText("My account")).isDisplayed();
		Assert.assertEquals(status, true);
		}
		
		catch(Exception e)
		{
			Assert.fail();
		}	
	}
	
	@Test(priority=3, dependsOnMethods = {"testlogin"})
	void logout() throws InterruptedException
	{
		driver.findElement(By.linkText("Log out")).click();
		Thread.sleep(3000);
		boolean status = driver.findElement(By.linkText("Register")).isDisplayed();
		Assert.assertEquals(status, true);
		
	}
	
	@AfterClass
	void tearDown() 
	{
		driver.close();
	}
	
}
