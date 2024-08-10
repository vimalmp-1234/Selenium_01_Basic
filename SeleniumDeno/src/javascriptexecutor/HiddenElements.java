package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/signup");

		WebElement CustomGender = driver.findElement(By.name("custom_gender"));
		WebElement Firstname = driver.findElement(By.name("firstname"));


		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='hey this is vikram'", CustomGender);
		js.executeScript("arguments[0].value='vikram'", Firstname);

	}

}
