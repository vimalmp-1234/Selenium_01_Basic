package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment18 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demowebshop.tricentis.com");
		WebElement AddtoCart = driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']/../..//input[contains(@value,'Add to cart')]"));
		AddtoCart.click();

		WebElement CheckText = driver.findElement(By.xpath("//p[@class='content']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.invisibilityOf(CheckText));


		driver.findElement(By.xpath("//a[text()='Log in']")).click();

	}

}
