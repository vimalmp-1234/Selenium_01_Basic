package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopups {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[.='Departure']")).click();
		Thread.sleep(1000);
		
		String month= "October";
		int year=2024;
		int date=20;

		while(true) {
			try {
				
				driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//p[text()='"+date+"']")).click();
				break;
				
			} catch (Exception e) {

				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();

			}

		}

	}

}
