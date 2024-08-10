package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment12 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String Type = driver.findElement(By.name("q")).getAttribute("title");
		System.out.println(Type);
		String Tooltip = driver.findElement(By.xpath("(//a[@title='Login'])[1]")).getAttribute("title");
		System.out.println(Tooltip);
		String Helplink = driver.findElement(By.xpath("//a[@title='Dropdown with more help links']")).getAttribute("title");
		System.out.println(Helplink);
	}

}
