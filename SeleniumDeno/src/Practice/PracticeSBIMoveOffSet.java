package Practice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeSBIMoveOffSet {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		
		driver.get("https://yonobusiness.sbi/");
		driver.findElement(By.partialLinkText("LOGIN")).click();
		driver.findElement(By.id("userName")).sendKeys("Vikramt");
		driver.findElement(By.id("password")).sendKeys("Tester@123");
		Thread.sleep(1000);
		
		Actions Act = new Actions(driver);
		Act.moveByOffset(1184, 314).clickAndHold().perform();


	}

}
