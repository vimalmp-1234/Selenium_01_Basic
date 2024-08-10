package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HanldesMultipleTabs {

	public static void main(String[] args){
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		//Thread.sleep(30000);
		driver.findElement(By.linkText("Facebook")).click();
		Set<String> allwindowIds = driver.getWindowHandles();
		
		for(String id:allwindowIds)
		{
			System.out.println(id);
		}

	}

}
