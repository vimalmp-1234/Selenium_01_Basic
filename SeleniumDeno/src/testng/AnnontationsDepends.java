package testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class AnnontationsDepends {
	
	@Test(dependsOnMethods = "Register")
	public void Login()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/login");
		Reporter.log("Login page is displayed",true);
		//driver.close();
	}
	
	@Test
	public void Register()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/register");
		Reporter.log("Register page is displayed",true);
		//driver.close();
	}
	@Test(dependsOnMethods = {"Register" , "Login"})
	public void AddProduct()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/cart");
		
		Reporter.log("AddToProduct page is displayed",true);
	}

}
