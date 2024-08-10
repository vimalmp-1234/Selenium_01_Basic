package webelementabstractmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCSSValue {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		WebElement CheckStyles = driver.findElement(By.xpath("//div[@class='validation-summary-errors']"));
		String Checkcolor = CheckStyles.getCssValue("color");
		String CheckFont = CheckStyles.getCssValue("font-family");
		String CheckSize = CheckStyles.getCssValue("font-size");
		System.out.println(Checkcolor);
		System.out.println(CheckFont);
		System.out.println(CheckSize);
		

	}

}
