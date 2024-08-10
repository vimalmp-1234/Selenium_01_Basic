package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsPopUps {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		WebElement Serach = driver.findElement(By.xpath("//input[@value='Search']"));
		Serach.click();
		Alert AlertPopup = driver.switchTo().alert();
		String GetText = AlertPopup.getText();
		System.out.println(GetText);
		Thread.sleep(1000);
		AlertPopup.accept();
		
		

	}

}
