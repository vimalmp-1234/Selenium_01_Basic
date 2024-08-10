package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleQspiderApp {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Web Table']")).click();
		Thread.sleep(2000);
		String Value = driver.findElement(By.xpath("//th[contains(text(),'SAMSUNG Galaxy')]/following-sibling::td[3]")).getText();

		if(Value.equals("30%"))
		{
			System.out.println("30% Discount is Available");
		}
		else
		{
			System.out.println("30% Discount is not Available");
		}
	}

}
