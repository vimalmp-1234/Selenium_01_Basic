package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopups {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("submit")).click();
		Alert Confirmpopup = driver.switchTo().alert();
		String GetText = Confirmpopup.getText();
		System.out.println(GetText);
		Confirmpopup.accept();
		
		Thread.sleep(1000);
		String Getmsg = Confirmpopup.getText();
		System.out.println(Getmsg);
		Confirmpopup.accept();

	}

}
