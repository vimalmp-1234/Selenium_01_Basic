package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/15");
		Thread.sleep(20000);
		driver.findElement(By.id("compare")).click();
		
		Set<String> allwindowids = driver.getWindowHandles();
		
		for(String id: allwindowids)
		{
			driver.switchTo().window(id).close();
			Thread.sleep(1000);
			System.out.println("Checked and closedTab");
		}

	}

}
