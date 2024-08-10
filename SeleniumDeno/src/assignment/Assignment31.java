package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment31 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.abhibus.com/");
		
		Actions Act = new Actions(driver);
		Act.moveByOffset(800, 280).click().perform();
		
		driver.findElement(By.xpath("//span[@class='calender-month-change']")).click();	
		
		String month= "September";
		
		while(true)
		{
			try {
				
				driver.findElement(By.xpath("//span[text()='"+month+"']/../../..//span[text()='20']")).click();
				break;
				
			} catch (Exception e) {
				
				driver.findElement(By.xpath("(//span[@class='calender-month-change'])[2]")).click();	
				
			}
		}
	}

}
