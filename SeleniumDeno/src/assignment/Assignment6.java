package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		driver.findElement(By.linkText("LOGIN")).click();
		driver.findElement(By.name("email")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();
		System.out.println(title);
			if(title.equals("SkillRary Ecommerce")) {
			System.out.println("User is able login and Welcome screen is displayed");
		}
		else
		{
			System.out.println("User is not able to login and Welcome screen is not displayed");
		}

	}

}
