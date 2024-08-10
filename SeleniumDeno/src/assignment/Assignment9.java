package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment9 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
		Thread.sleep(2000);
		String Value = driver.findElement(By.xpath("//th[contains(text(),'SAMSUNG Galaxy')]/following-sibling::td[3]")).getText();
		System.out.println(Value);

	}

}
