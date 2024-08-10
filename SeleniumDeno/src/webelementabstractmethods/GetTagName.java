package webelementabstractmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagName {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		String tagname = driver.findElement(By.id("Email")).getTagName();
		System.out.println(tagname);

	}

}
