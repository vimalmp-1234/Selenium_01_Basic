package carstestng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LaunchRangeRover {
	
	@Test
	public void RangeRover()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.landrover.in/range-rover/range-rover/index.html");
		Reporter.log("RangeRover page is displayed",true);
	}


}
