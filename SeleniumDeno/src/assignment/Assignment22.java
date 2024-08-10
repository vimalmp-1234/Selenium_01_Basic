package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment22 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demoapp.skillrary.com/");

		WebElement Year = driver.findElement(By.id("cars"));
		Select CarsSelect = new Select(Year);
		List<WebElement> options = CarsSelect.getOptions();

		CarsSelect.selectByIndex(options.size() - 1);

	}

}
