package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/15");
		Thread.sleep(20000);
		driver.findElement(By.id("compare")).click();
		Set<String> allwindowids = driver.getWindowHandles();

		for(String id: allwindowids)
		{
			String url = driver.switchTo().window(id).getCurrentUrl();
			if(url.contains("flipkart"))
			{
				Thread.sleep(2000);
				driver.close();	
				System.out.println("FlipkartWebPage closed");
			}
			

			else if(url.contains("ebay"))
			{
				Thread.sleep(5000);
				driver.manage().window().maximize();
				System.out.println("Maximized ebay page");
			}
			
		}
	}

}
