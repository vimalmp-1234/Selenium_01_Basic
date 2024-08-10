package webelementabstractmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		WebElement Price = driver.findElement(By.xpath("//option[@value='199']"));
		System.out.println(Price.isSelected());
		
		Price.click();
		
		System.out.println("----------After click-------");
		
		System.out.println(Price.isSelected());
		

	}

}
