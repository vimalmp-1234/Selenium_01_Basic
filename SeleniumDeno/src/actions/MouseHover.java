package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.flipkart.com/");
		WebElement Fashion = driver.findElement(By.xpath("//span[text()='Fashion']"));
		Actions Act = new Actions(driver);
		Act.moveToElement(Fashion).perform();
		
		WebElement MenFashion = driver.findElement(By.xpath("//a[text()='Men Footwear']"));
		Act.moveToElement(MenFashion).perform();
		
		driver.findElement(By.linkText("Men's Casual Shoes")).click();
		

	}

}
