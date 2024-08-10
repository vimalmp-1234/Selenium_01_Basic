package bikestestng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LaunchHarleyDavidson {
	
	@Test(groups = "smoke")
	public void HarleyDavidson()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.harley-davidson.com/in/en/index.html");
		Reporter.log("HarleyDavidson page is displayed",true);
	}

}
