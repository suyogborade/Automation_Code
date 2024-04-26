package Selenium_Practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandleSubscription {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://csc-mock.netlify.app/64b656bd2e6d9c1f59c57aa7/Client-Story-Id-1");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.switchTo().frame("csc-id");
		Thread.sleep(3000);

		driver.findElement(By.id("subDivBtn")).click();

		driver.findElement(By.id("mainSubmitBtn")).click();

		Set<String> currWindowHandle = driver.getWindowHandles();
		List<String> winList = new ArrayList<String>(currWindowHandle);

		String parentWin = winList.get(0);
		String childWin = winList.get(1);

		driver.switchTo().window(childWin);

		driver.findElement(By.xpath("(//button[text()='Buy Now'])[1]")).click();

		driver.findElement(By.cssSelector(".LoginCustomisation_inputField__2r18P")).sendKeys("6230289890");

		driver.findElement(By.xpath("//button[contains(text(),'Get OTP')]")).click();

		WebElement otp = driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(4000);
		otp.sendKeys("1234");

		WebElement name = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div[1]/div/input"));
		name.clear();
		name.sendKeys("Suyog");

		WebElement mail = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div[2]/div/div/div/input"));
		mail.clear();
		mail.sendKeys("suyogseltest@gmail.com");

		driver.findElement(By.cssSelector(".reviewSubscription_pay__2sWQV")).click();

		WebElement razorpay = driver.findElement(By.xpath("//iframe[@class='razorpay-checkout-frame']"));
		driver.switchTo().frame(razorpay);

		Thread.sleep(7000);
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"form-common\"]/div[1]/div[1]/div/div/div/div/button[3]/div"))).click();
		driver.findElement(By.xpath("//*[@id=\\\"form-common\\\"]/div[1]/div[1]/div/div/div/div/button[3]/div"))
				.click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[contains(@class,'mchild item-inner')]")).click();

		driver.findElement(By.cssSelector("#redesign-v15-cta")).click();

		driver.findElement(By.cssSelector("button.success")).click();

		driver.switchTo().window(parentWin);

		driver.navigate().refresh();

	}

}
