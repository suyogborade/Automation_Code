package Selenium_Practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.Message;
import com.mailosaur.models.MessageSearchParams;
import com.mailosaur.models.SearchCriteria;

public class Conscent_Login {

	public WebDriver driver;

	String apiKey = "7oAyjg5N1XdpoKYcogMlTNqCdfmfGLGA";
	String serverId = "efc7ir5t";
	String serverDomain = "efc7ir5t.mailosaur.net";
	String from = "support@conscent.in";

	public String getRandomMail() {
		return "user" + System.currentTimeMillis() + "@" + serverDomain;
	}

	@Test
	public void testMail() throws IOException, MailosaurException, InterruptedException {
		String emailId = getRandomMail();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait newWait = new WebDriverWait(driver, java.time.Duration.ofSeconds(60));

		driver.get("https://conscent-demo-new.netlify.app/");
		WebElement loginClick = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
		newWait.until(ExpectedConditions.elementToBeClickable(loginClick)).click();

		driver.switchTo().frame("csc-id");
		WebElement loginPopup = newWait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Mobile / Email']")));
		loginPopup.sendKeys(emailId);
		driver.findElement(By.xpath("//button[text()='Get OTP']")).click();

		MailosaurClient mailosaur = new MailosaurClient(apiKey);

		MessageSearchParams params = new MessageSearchParams();
		params.withServer(serverId);

		SearchCriteria criteria = new SearchCriteria();
		criteria.withSentTo(emailId);
		criteria.withSentFrom(from);

		Message message = mailosaur.messages().get(params, criteria);

		System.out.println(message.text().body()); // "Your access code is QZ524822."

		System.out.println(message.html().codes().size()); // 2

		com.mailosaur.models.Code firstCode = message.html().codes().get(0);

		String otp = firstCode.value();
		System.out.println(otp); // "456812"

		driver.findElement(By.xpath("//input [@id=\"1\"]")).sendKeys(otp);
		Thread.sleep(10000);
	}

	@Test
	public void contentClick() {
		driver.navigate().refresh();
		driver.findElement(By.xpath("//*[text()='POLITICS']")).click();

	}

}
