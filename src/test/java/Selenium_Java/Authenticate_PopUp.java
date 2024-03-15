package Selenium_Java;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Authenticate_PopUp {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		String text = driver.findElement(By.xpath("//p[contains(text(),'Congratulations')]")).getText();
		
		if(text.contains("Congratulations"))
		{
			System.out.println("Login Passed");
		}
		else
		{
			System.out.println("Login Failed");
		}
		
		
	}

}
