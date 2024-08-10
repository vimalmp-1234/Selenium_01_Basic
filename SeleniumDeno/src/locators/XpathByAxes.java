package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxes {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/vikra/OneDrive/Desktop/Movies.html");
		String Text = driver.findElement(By.xpath("//td[text()='KGF']/following-sibling::td[1]")).getText();
		System.out.println(Text);
		String Slno = driver.findElement(By.xpath("//td[text()='Saalar']/preceding-sibling::td[1]")).getText();
		System.out.println(Slno);
		String MovieName = driver.findElement(By.xpath("//td[text()='Saalar']/following-sibling::td[1]")).getText();
		System.out.println(MovieName);

	}

}
