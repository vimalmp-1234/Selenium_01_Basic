package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		String parentId = driver.getWindowHandle();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Thread.sleep(3000);
		Set<String> allwindowIds = driver.getWindowHandles();
		
		for(String id:allwindowIds)
		{
			String url = driver.switchTo().window(id).getCurrentUrl();
			System.out.println(id);
			if (url.contains("facebook"))
			{
				Thread.sleep(1000);
				driver.close();
			}
		}
		driver.switchTo().window(parentId);
		String title = driver.getTitle();
		System.out.println(title);

	}

}
