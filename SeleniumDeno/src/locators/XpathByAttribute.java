package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Vikram@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Vtr123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		//driver.findElement(By.xpath("//input[@id='register-button']")).click();

	}

}
