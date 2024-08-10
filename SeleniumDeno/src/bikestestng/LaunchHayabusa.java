package bikestestng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LaunchHayabusa {
	
	@Test(groups = "smoke")
	public void Hayabusa()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.suzukimotorcycle.co.in/product-details/hayabusa");
		Reporter.log("Hayabusa page is displayed",true);
	}

}
