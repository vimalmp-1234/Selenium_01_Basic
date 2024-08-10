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
import org.openqa.selenium.io.FileHandler;

public class Assignment29 {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String SystemTime = LocalDateTime.now().toString().replace(":", "-");
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[@value='Subscribe']")).click();
		WebElement Image = driver.findElement(By.xpath("//div[text()='Enter valid email']"));
		System.out.println(Image.getText());
		
		File temp = Image.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/Subscribe"+SystemTime+".png");
		FileHandler.copy(temp, dest);

	}

}
