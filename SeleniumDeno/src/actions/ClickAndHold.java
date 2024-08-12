package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://yonobusiness.sbi/");
		driver.findElement(By.partialLinkText("LOGIN")).click();
		driver.findElement(By.id("password")).sendKeys("Tester@123");
		WebElement Login = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
		Actions Act = new Actions(driver);
		Act.clickAndHold(Login).perform();
		
		
		driver.findElement(By.id("userName")).sendKeys("Vikramt");
		Act.release(Login).perform();
		
	}

}
