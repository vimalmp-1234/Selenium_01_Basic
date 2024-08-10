package webelementabstractmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Rectangle Rectangle = driver.findElement(By.xpath("//input[@value='Vote']")).getRect();
		System.out.println("Height: "+Rectangle.getHeight());
		System.out.println("Width: "+Rectangle.getWidth());
		System.out.println("x: "+Rectangle.getX());
		System.out.println("y: "+Rectangle.getY());

	}

}
