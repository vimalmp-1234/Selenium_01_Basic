package webelementabstractmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BooleanMethods {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println("LoginButton is displayed: "+LoginButton.isDisplayed());
		System.out.println("LoginButton is enabled: "+LoginButton.isEnabled());
		
		driver.findElement(By.name("username")).sendKeys("Vikram");
		driver.findElement(By.name("password")).sendKeys("Vikram@12223");
		
		
		System.out.println("LoginButton is displayed: "+LoginButton.isDisplayed());
		System.out.println("LoginButton is enabled: "+LoginButton.isEnabled());

	}

}
