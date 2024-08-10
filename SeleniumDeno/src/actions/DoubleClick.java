package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium");
		WebElement AddIcon = driver.findElement(By.id("add"));
		Actions act = new Actions(driver);
		act.doubleClick(AddIcon).perform();
		act.doubleClick(AddIcon).perform();
		
		
		WebElement Minus = driver.findElement(By.id("minus"));
		Actions Icon = new Actions(driver);
		Icon.doubleClick(Minus).perform();

	}

}
