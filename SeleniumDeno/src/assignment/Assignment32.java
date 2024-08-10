package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Assignment32 {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.freshersworld.com/");
		driver.findElement(By.xpath("//span[text()='REGISTER NOW']")).click();
		driver.findElement(By.id("firstname")).sendKeys("Vikram");
		driver.findElement(By.id("lastname")).sendKeys("vtr",Keys.TAB);
		driver.findElement(By.id("email")).sendKeys("Vikr@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Viki@12234");
		driver.findElement(By.id("mobile")).sendKeys("9977663388");
		WebElement cityDropdown = driver.findElement(By.id("currentCity"));
//		WebElement Select1 = driver.findElement(By.id("id=\"select2-currentCity-container\""));
		Select City = new Select(cityDropdown);
		City.selectByVisibleText("Bangalore");
		
		
//		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\vikra\\eclipse-workspace\\SeleniumDeno\\resume\\VikramT_QA.pdf");

	}

}
