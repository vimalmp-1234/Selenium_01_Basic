package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		WelcomePage wp = new WelcomePage(driver);
		wp.getRegisterLink().click();
		
		Thread.sleep(2000);
		driver.navigate().back();
		wp.getLoginLink().click();
		
		Thread.sleep(2000);
		driver.navigate().back();
		wp.getShoppingLink().click();
	

	}

}
