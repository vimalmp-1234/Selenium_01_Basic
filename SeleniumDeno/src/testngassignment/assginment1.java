package testngassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assginment1 {
	@Test(priority = 2)
	public void Login()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("username");
		driver.findElement(By.id("Password")).sendKeys("password");
		Reporter.log("Login page is displayed and entered login details",true);
		//driver.close();
	}
	
	@Test(priority = 1)
	public void Register()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.id("FirstName")).sendKeys("FirstName");
		driver.findElement(By.id("LastName")).sendKeys("LastName");
		driver.findElement(By.id("Email")).sendKeys("email");
		driver.findElement(By.name("Password")).sendKeys("pwd");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("cfpwd");
		Reporter.log("Register page is displayed and entered details",true);
		//driver.close();
	}

}
