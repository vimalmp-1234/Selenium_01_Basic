package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pratctice2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);


		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

		if (loginButton.isEnabled())
		{
			System.out.println("Login button is enabled");
		} 
		else 
		{
			System.out.println("Login button is not enabled");
		}

		driver.findElement(By.name("username")).sendKeys("Vikram");
		driver.findElement(By.name("password")).sendKeys("Vikram@12223");

		if (loginButton.isEnabled()) 
		{
			System.out.println("Login button is enabled");
		} 
		else
		{
			System.out.println("Login button is not enabled");
		}

		driver.quit();

	}

}
