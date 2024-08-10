package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.shoppersstack.com/products_page/15");
		driver.findElement(By.id("compare")).click();
		
		
		switchTowindow(driver, "amazon");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.close();
		
		Thread.sleep(2000);
		
		switchTowindow(driver, "flipkart");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.close();
		
		Thread.sleep(2000);
		
		switchTowindow(driver, "ebay");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.close();

	}
	public static void switchTowindow(WebDriver driver, String ExpUser)
	{
		Set<String> AllWindowsIds = driver.getWindowHandles();
		for (String id:AllWindowsIds)
		{
			String url = driver.switchTo().window(id).getCurrentUrl();
			if(url.contains(ExpUser)) {
				break;
			}
		}
	}

}
