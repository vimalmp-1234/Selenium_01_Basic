package webelementabstractmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClearAction {

	public static void main(String[] args) throws InterruptedException  {
		//ChromeDriver driver = new ChromeDriver();
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement ElementClear = driver.findElement(By.id("username"));
		Thread.sleep(1000);
		ElementClear.clear();
		Thread.sleep(1000);
		ElementClear.sendKeys("Vikram");

	}

}
