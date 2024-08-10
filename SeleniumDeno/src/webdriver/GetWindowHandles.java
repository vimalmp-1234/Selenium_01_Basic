package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.shoppersstack.com/products_page/15");
		Thread.sleep(30000);
		driver.findElement(By.id("compare")).click();
		
		Set<String> allwindowIds = driver.getWindowHandles();
		System.out.println(allwindowIds);
		
		for(String id:allwindowIds)
		{
			System.out.println(id);
		}

	}

}
