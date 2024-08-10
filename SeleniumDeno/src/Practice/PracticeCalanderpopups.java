package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeCalanderpopups {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[.='Departure']")).click();
		Thread.sleep(1000);

		for( ;;)
		{
			try {

				driver.findElement(By.xpath("//div[text()='December 2024']/../..//p[text()='15']")).click();
				break;

			} catch (Exception e) {

				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();


			}
		}

	}

}
