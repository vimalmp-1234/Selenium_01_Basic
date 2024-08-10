package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Assignment26 {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String SystemTime = LocalDateTime.now().toString().replace(":", "-");
		
		driver.get("https://yonobusiness.sbi/");
		driver.findElement(By.partialLinkText("LOGIN")).click();
		driver.findElement(By.id("userName")).sendKeys("Vikramt");
		driver.findElement(By.id("password")).sendKeys("Tester@123");
		WebElement Login = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
		Actions Act = new Actions(driver);
		Act.moveToElement(Login).clickAndHold().perform();
		
		File Temp = driver.findElement(By.xpath("//input[@aria-label='PASSWORD']")).getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/password"+SystemTime+".png");
		FileHandler.copy(Temp, dest);
		Thread.sleep(1000);
		
		Act.release().perform();
	}

}
