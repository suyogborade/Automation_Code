package Selenium_Java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FIleUpload {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		/*
		driver.findElement(By.cssSelector("#filesToUpload")).sendKeys("/Users/suyogborade/Desktop/Bruno/Bruno API/bruno.json");
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("bruno.json"))
				{
					System.out.println("File is Successfully Uploaded");
				}
		
		else
		{
			System.out.println("File failed to Upload");
		}  */
		
		String file1= "/Users/suyogborade/Desktop/Bruno/Bruno API/bruno.json";
		String file2="/Users/suyogborade/Desktop/Bruno/Bruno API/bruno copy.json";
	
		driver.findElement(By.cssSelector("#filesToUpload")).sendKeys(file1+"\n" + file2);
		
		int noOfFileUploaded = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		
		if(noOfFileUploaded==2)
		{
			System.out.println("All files are uploaded Successfully");
		}
		
		else
		{
			System.out.println("Files not uploaded Correctly");
		}

	}

}
