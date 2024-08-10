package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		boolean CheckButton = LoginButton.isEnabled();
		
		if(LoginButton.isEnabled())
		{
			System.out.println("Login button is enabled: " + CheckButton);
		}
		else
		{
			System.out.println("Login button is not enabled: " + CheckButton);
		}
		
		driver.findElement(By.name("username")).sendKeys("Vikram");
		driver.findElement(By.name("password")).sendKeys("Vikram@12223");
		
		CheckButton = LoginButton.isEnabled();
		
		if(LoginButton.isEnabled())
		{
			System.out.println("Login button is enabled: " + CheckButton);
		}
		else
		{
			System.out.println("Login button is not enabled: " + CheckButton);
		}
		driver.quit();

	}

}
