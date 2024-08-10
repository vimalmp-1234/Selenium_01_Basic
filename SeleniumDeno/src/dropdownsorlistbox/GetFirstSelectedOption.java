package dropdownsorlistbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOption {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement GetFirstDD = driver.findElement(By.id("cars"));
		Select DDlist = new Select(GetFirstDD);
		DDlist.selectByIndex(1);
		DDlist.selectByIndex(0);
		DDlist.selectByIndex(3);
		
		WebElement FirstSelect = DDlist.getFirstSelectedOption();
		System.out.println(FirstSelect.getText());
	}

}
