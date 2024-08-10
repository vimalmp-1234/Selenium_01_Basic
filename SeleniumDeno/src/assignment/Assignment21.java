package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment21 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.facebook.com/r.php");

		WebElement Year = driver.findElement(By.id("year"));
		Select yearSelect = new Select(Year);
		List<WebElement> options = yearSelect.getOptions();

		yearSelect.selectByIndex(options.size() - 1);
		
	}

}
