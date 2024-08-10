package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment17 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.id("name")).sendKeys("Viki");
		driver.findElement(By.id("email")).sendKeys("Viki@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Viki@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebElement Login = driver.findElement(By.xpath("//h1[text()='Login']"));
		if(Login.getText().equals("Login")) {
			System.out.println("Login Page is displayed");
		}
		else
		{
			System.out.println("Login Page is not displayed");
		}
	}

}
