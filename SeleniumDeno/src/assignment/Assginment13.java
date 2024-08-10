package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assginment13 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		WebElement isenabled = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		boolean CheckTextBox = isenabled.isEnabled();
		
		if(isenabled.isEnabled())
		{
			System.out.println("It is enabled :- " + CheckTextBox);
		}
		else
		{
			System.out.println("It is not Enabled:- " + CheckTextBox);
		}
		driver.quit();

	}

}
