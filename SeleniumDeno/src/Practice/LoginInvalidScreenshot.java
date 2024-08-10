package Practice;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class LoginInvalidScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		
		String SystemTime = LocalDateTime.now().toString().replace(":", "-");
		
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		File Invalid = driver.findElement(By.xpath("//span[contains(text(),'Login was unsuccessful')]")).getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/element"+SystemTime+".png");
		FileHandler.copy(Invalid, dest);
	}

}
