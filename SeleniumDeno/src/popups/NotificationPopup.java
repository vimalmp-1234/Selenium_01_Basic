package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		//option.addArguments("--disable-notifications");//Nofification disable
		option.addArguments("--start-maximized");
		option.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(option);
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
		driver.get("https://www.redbus.in/");

	}

}
