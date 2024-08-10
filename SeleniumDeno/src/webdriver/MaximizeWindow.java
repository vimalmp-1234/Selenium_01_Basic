package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//driver.manage().window().fullscreen();
		driver.manage().window().minimize();
		driver.close();

	}

}
