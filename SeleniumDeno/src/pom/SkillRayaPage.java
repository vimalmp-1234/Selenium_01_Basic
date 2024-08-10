package pom;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillRayaPage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		
		SkillrayaSearch skp = new SkillrayaSearch(driver);
		skp.getSearchTextFiled().sendKeys("Selenium", Keys.ENTER);
		
		skp.getSearchTextFiled().sendKeys("testng", Keys.ENTER);
		
//		WebElement skp = driver.findElement(By.id("navbar-search-input"));
//		skp.sendKeys("Selenium", Keys.ENTER);
//		
//		skp.sendKeys("testng", Keys.ENTER);
		

	}

}
