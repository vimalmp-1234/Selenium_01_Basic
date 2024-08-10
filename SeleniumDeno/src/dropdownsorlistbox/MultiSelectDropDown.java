package dropdownsorlistbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement Multi = driver.findElement(By.id("cars"));
		Select DropDown = new Select(Multi);
		DropDown.selectByIndex(0);
		DropDown.selectByValue("299");
		DropDown.selectByVisibleText("INR 100 - INR 199 ( 16 )");

	}

}
