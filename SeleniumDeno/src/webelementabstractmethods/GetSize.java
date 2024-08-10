package webelementabstractmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Dimension Size = driver.findElement(By.xpath("//input[@value='Search']")).getSize();
		System.out.println(Size.getHeight());
		System.out.println(Size.getWidth());
		Dimension SearchBar = driver.findElement(By.id("small-searchterms")).getSize();
		System.out.println(SearchBar.getHeight());
		System.out.println(SearchBar.getWidth());
	}

}
