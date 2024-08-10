package dropdownsorlistbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/r.php");
		WebElement DropDown = driver.findElement(By.id("day"));
		Select CheckDD = new Select(DropDown);
		CheckDD.selectByIndex(14);
		
		WebElement Month = driver.findElement(By.id("month"));
		Select CheckMonth = new Select(Month);
		CheckMonth.selectByValue("8");
		
		WebElement Year = driver.findElement(By.id("year"));
		Select CheckYear = new Select(Year);
		CheckYear.selectByVisibleText("1947");
		
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
	}

}
