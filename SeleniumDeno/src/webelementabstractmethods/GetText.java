package webelementabstractmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetText {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		String ErrorMsg = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getText();
		System.out.println(ErrorMsg);
		
		if(ErrorMsg.contains("Login was unsuccessful"))
		{
			System.out.println("Error msg is diaplayed");
		}
		else
		{
			System.out.println("Error msg is not displayed");
		}
		driver.quit();
	}

}
