package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assginment4 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/15");
		String parentId = driver.getWindowHandle();
		Thread.sleep(30000);
		driver.findElement(By.id("compare")).click();
		Set<String> allwindowids = driver.getWindowHandles();

		for(String id: allwindowids)
		{
			String url = driver.switchTo().window(id).getCurrentUrl();
			if (!url.contains("shopperstack"))
			{
				Thread.sleep(1000);
				driver.close();
				System.out.println("Closed Tabs");
			}

		}
		driver.switchTo().window(parentId);
		String title = driver.getTitle();
		System.out.println(title);
	}
}
