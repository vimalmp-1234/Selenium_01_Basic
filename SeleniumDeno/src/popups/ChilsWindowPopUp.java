package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChilsWindowPopUp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.shoppersstack.com/products_page/15");
		String ParentId = driver.getWindowHandle();
		driver.findElement(By.id("compare")).click();
		Set<String> AllWindowsIds = driver.getWindowHandles();
		
		for(String id:AllWindowsIds)
		{
			String url = driver.switchTo().window(id).getCurrentUrl();
			if(url.contains("amazon")) {	
			break;
			}
			
		}
		System.out.println(driver.getTitle());
		driver.close();

		driver.switchTo().window(ParentId);
	}

}
