package assignment;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment10 {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement Username = driver.findElement(By.id("username"));
		WebElement Password = driver.findElement(By.id("password"));
		WebElement Action = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		Username.clear();
		Username.sendKeys("Vikram");
		Password.clear();
		Password.sendKeys("Vikram@12");
		
		Action.submit();
		
		String Msg = driver.findElement(By.xpath("//span[@id='validationMessage']")).getText();
		System.out.println(Msg);
		
		

	}

}
