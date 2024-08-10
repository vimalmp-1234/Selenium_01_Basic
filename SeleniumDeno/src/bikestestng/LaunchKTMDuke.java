package bikestestng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LaunchKTMDuke {
	
	@Test(groups = "system")
	public void KTMDuke()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.ktm.com/en-in/models/naked-bike/ktm-250-duke.html");
		Reporter.log("KTMDuke page is displayed",true);
	}

}
