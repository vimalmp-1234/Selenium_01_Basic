package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment20 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Books")).click();
		
		 WebElement sortBy = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("products-orderby")));
         Select ZtoA = new Select(sortBy);
         ZtoA.selectByIndex(2);
		
		WebElement Display = driver.findElement(By.id("products-pagesize"));
		Select PageSize= new Select(Display);
		PageSize.selectByVisibleText("12");
		
		WebElement View = driver.findElement(By.id("products-viewmode"));
		Select ViewAs = new Select(View);
		ViewAs.selectByVisibleText("List");
		driver.quit();

	}

}
