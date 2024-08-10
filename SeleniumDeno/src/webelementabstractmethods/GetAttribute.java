package webelementabstractmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String Value = driver.findElement(By.name("q")).getAttribute("placeholder");
		System.out.println(Value);
		String Type = driver.findElement(By.name("q")).getAttribute("title");
		System.out.println(Type);
	}

}
