package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class DataProviderDemo {

	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver = new ChromeDriver();
	}
	
	@Test(dataProvider ="dp")
	void testLogin(String email, String pwd)
	{
		driver.get("https://demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[text()='Log in']")).submit();
	
		String exp_Title = "nopCommerce demo store. Login";
		String act_Title= driver.getTitle();
		
		Assert.assertEquals(act_Title, exp_Title);
		
	}
	
	@AfterClass
	void tearDown() 
	{
		driver.close();
	}
	
	@DataProvider(name ="dp") //indices= {0,2})
	String [] [] loginData()
	{
		String data [] [] = 
			{
					{"suyogborade@yahoo.in", "Pass@123"},
					{"suyog@outlook.ai", "abc@123"},
					{"suyog1@gmail.com","demo@123"},
					{"selenium@java.com", "automation123"},
					{"suyog1@gmail.com","demo@123"}
		};
		return data;
	}
	
	
}

