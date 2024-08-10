package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicesearch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("vikram@gmail.com");
		WebElement passwords = driver.findElement(By.cssSelector("input[type='password']"));
		passwords.sendKeys("Raihana");
		WebElement Search = driver.findElement(By.cssSelector("button[type='submit']"));
		Search.submit();

		
	}

}
