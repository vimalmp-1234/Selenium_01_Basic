package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetQuit {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.shoppersstack.com/products_page/8");
		Thread.sleep(20000);
		driver.findElement(By.id("compare")).click();
		//driver.close();
		driver.quit();
	}


}
