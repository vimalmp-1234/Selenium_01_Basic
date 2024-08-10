package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetClose {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.Myntra.com/");
		driver.close();

	}

}
