package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/r.php");
		
		WebElement Month = driver.findElement(By.id("month"));
		Select AllOptions = new Select(Month);
		List<WebElement> MonthList = AllOptions.getOptions();
		
		System.out.println(AllOptions.isMultiple());
		
		System.out.println(MonthList.size());
		
		for(WebElement MonthCount : MonthList)
		{
			System.out.println(MonthCount.getText());
		}

	}

}
