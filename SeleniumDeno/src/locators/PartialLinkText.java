package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		//driver.findElement(By.partialLinkText("Recently")).click();
		driver.findElement(By.partialLinkText("Digital downloads")).click();

	}

}
