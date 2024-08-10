package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Assignment27 {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String SystemTime = LocalDateTime.now().toString().replace(":", "-");
		
		driver.get("https://www.myntra.com/");
		WebElement Men = driver.findElement(By.xpath("//a[text()='Men']"));
		Actions Act = new Actions(driver);
		Act.moveToElement(Men).perform();
		
		TakesScreenshot TS = (TakesScreenshot) driver;
		File temp = TS.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/FullPage"+SystemTime+".png");
		FileHandler.copy(temp, dest);
		
		driver.findElement(By.xpath("//a[text()='Casual Shoes']")).click();

	}

}
