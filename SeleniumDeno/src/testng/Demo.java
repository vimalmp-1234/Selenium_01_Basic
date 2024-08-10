package testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	
	
	
	@Test
	public void sample123() throws InterruptedException{
		
		Reporter.log("Welcome to TestNG simple", true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
	}
	
	@Test
	public void demo() {
		Reporter.log("Welcome to TestCases demo", true);
	}
	
	@Test
	public void test() {
		Reporter.log("I have executed test cases test",true);
	}
	
	@Test
	public void zest() {
		Reporter.log("I have test cases zest",true);
	}
}
