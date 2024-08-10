package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Insta {


	@Test(dataProviderClass = Data.class,  dataProvider = "sendcred")
	public void instagram(String[] cred) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.instagram.com/");
		Assert.assertEquals(driver.getTitle(), "Instagram", "Instagram login page is not displayed");
		Reporter.log("Instagram login page is displayed", true);
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));

		boolean isEnabled = login.isEnabled();
		Assert.assertFalse(isEnabled, "Login button is enabled");
		Reporter.log("Login button is not Enabled",true);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(cred[0]);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(cred[1]);
		Thread.sleep(1000);

		boolean isEnable = login.isEnabled();
		Assert.assertTrue(isEnable, "Login button is not enabled");
		Reporter.log("Login button is enabled", true);
		driver.quit();
	}

}
