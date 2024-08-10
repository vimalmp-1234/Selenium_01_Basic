package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Aggignment24 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://petdiseasealerts.org/forecast-map/#/");

		WebElement Iframe = driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]"));
		driver.switchTo().frame(Iframe);
		driver.findElement(By.id("region-27")).click();

		driver.switchTo().defaultContent();


		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		driver.findElement(By.id("user")).sendKeys("Vikryyq@gmail.com",Keys.TAB);
		driver.findElement(By.id("pass")).sendKeys("Vik@123123");
		driver.findElement(By.id("cpass")).sendKeys("Vik@123123");
		driver.findElement(By.id("firstName")).sendKeys("vikram");
		driver.findElement(By.id("lastName")).sendKeys("vtr");
		driver.findElement(By.id("phone")).sendKeys("9988776655");

		WebElement UserType = driver.findElement(By.id("user-type"));
		Select Click = new Select(UserType);
		Click.selectByVisibleText("Academic");

		driver.findElement(By.id("accept-tou")).click();
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();

		String Msg = driver.findElement(By.xpath("//b[text()='Thank you for registering!']")).getText();
		System.out.println(Msg);
	}

}
