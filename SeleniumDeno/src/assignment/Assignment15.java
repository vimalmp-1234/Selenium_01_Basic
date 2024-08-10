package assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment15 {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement Username = driver.findElement(By.id("username"));
		WebElement Password = driver.findElement(By.id("password"));
		WebElement Action = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		Username.clear();
		Username.sendKeys("Vikram");
		Password.clear();
		Password.sendKeys("Vikram@12");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/image.png");
		FileHandler.copy(temp, dest);
		
		Action.submit();
		
		String Msg = driver.findElement(By.xpath("//span[@id='validationMessage']")).getText();
		System.out.println(Msg);
		
		
		File tempe = ts.getScreenshotAs(OutputType.FILE);
		File deste = new File("./screenshots/image1.png");
		FileHandler.copy(tempe, deste);

	}

}
