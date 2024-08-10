package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assginment5 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Register")).click();
		WebElement maleRadioButton = driver.findElement(By.id("gender-male"));
		maleRadioButton.click();
		driver.findElement(By.id("FirstName")).sendKeys("Vikram");
		driver.findElement(By.id("LastName")).sendKeys("Vtr");
		driver.findElement(By.id("Email")).sendKeys("Vikram@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Vikram123");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("Vikram123");
		Thread.sleep(2000);
		WebElement Register = driver.findElement(By.id("register-button"));
		Register.click();
		
		

	}

}
