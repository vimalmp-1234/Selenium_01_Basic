package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByDependentIndependent {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']/../..//input[contains(@value,'Add to cart')]")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();

	}

}
