package webdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		Point position = driver.manage().window().getPosition();
		System.out.println(position);
		System.out.println(position.getX());
		System.out.println(position.getY());
		
		driver.manage().window().setPosition(new Point(100, 100));

	}

}
