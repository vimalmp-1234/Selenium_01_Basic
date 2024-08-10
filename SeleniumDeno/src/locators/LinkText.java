package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.linkText("Log in")).click();
		

	}

}
