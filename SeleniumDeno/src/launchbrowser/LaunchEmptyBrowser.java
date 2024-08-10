package launchbrowser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEmptyBrowser {

	public static void main(String[] args) {
		//ChromeDriver driver = new ChromeDriver();	
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
	}

}
