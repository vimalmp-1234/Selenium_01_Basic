package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String windowId = driver.getWindowHandle();
		System.out.println(windowId);

	}

}
