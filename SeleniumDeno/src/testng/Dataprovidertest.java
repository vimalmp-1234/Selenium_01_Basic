package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovidertest 
{
	@DataProvider
	public String[][]  datsender() {String[][] data = {{"admin","admin"},{"user","user"},{"viki","viki2"}};
	return data;
	}
	@Test(dataProvider = "datsender")
	public void Loginscreen(String [] Cred) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapp.skillrary.com/login.php?type=login");

		driver.findElement(By.id("email")).sendKeys(Cred[0]);
		driver.findElement(By.id("password")).sendKeys(Cred[1]);
	}

}
