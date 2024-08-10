package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Vikram@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Vtr123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();

	}

}
