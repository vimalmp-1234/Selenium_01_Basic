package dropdownsorlistbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDeSelect {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/r.php");
		WebElement DropDown = driver.findElement(By.id("day"));
		Select CheckDD = new Select(DropDown);
		CheckDD.selectByIndex(14);
		
		CheckDD.deselectByIndex(14);

	}

}
