package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://instagram.com/");
		driver.findElement(By.xpath("//span[contains(text(),'Contact Uploading')]")).click();

	}

}
