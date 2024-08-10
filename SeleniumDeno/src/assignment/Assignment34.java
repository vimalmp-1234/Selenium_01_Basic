package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment34 {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String SystemTime = LocalDateTime.now().toString().replace(":", "-");
		driver.get("https://www.oracle.com/java/technologies/downloads/");
		driver.findElement(By.id("java8-doc-download")).click();
		
		ChangeWindow(driver, "javase-jdk8-doc-downloads");
		driver.findElement(By.linkText("javafx-8u411-apidocs.zip")).click();
		WebElement Downloadbutton = driver.findElement(By.linkText("Download javafx-8u411-apidocs.zip"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Downloadbutton);

		ChangeWindow(driver, "download-fail");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/DownloadPage"+SystemTime+".png");
		FileHandler.copy(temp, dest);
		Thread.sleep(2000);
		driver.navigate().back();
		ChangeWindow(driver, "javase-jdk8-doc-downloads");
		driver.findElement(By.xpath("//button[@aria-label='close modal']")).click();
		driver.findElement(By.xpath("//a[text()=\"No thanks, I'll stay here\"]")).click();
		
		driver.findElement(By.linkText("javafx-8u411-apidocs.zip")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.findElement(By.linkText("Download javafx-8u411-apidocs.zip")).click();
		driver.findElement(By.xpath("//button[@aria-label='close modal']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Java SE Development Kit 8 Documentation License Agreement')]")).click();

		ChangeWindow(driver, "javase8speclicense");
		List<WebElement> strongTags = driver.findElements(By.tagName("strong"));

		for (WebElement strongTag : strongTags)
		{
			System.out.println("Headings : " + strongTag.getText());

		}
		driver.close();
	}
	
	public static void ChangeWindow(WebDriver driver, String ExpResult)
	{
		Set<String> allwindows = driver.getWindowHandles();
		for(String id:allwindows)
		{
			String url = driver.switchTo().window(id).getCurrentUrl();
			if(url.contains(ExpResult))
			{
				break;
			}
		}
	}

}
