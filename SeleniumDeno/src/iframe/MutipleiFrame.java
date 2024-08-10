package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MutipleiFrame {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		
//		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
//		driver.findElement(By.xpath("//section[text()='Frames']")).click();
//		driver.findElement(By.xpath("//section[text()='iframes']")).click();
//		
//		driver.findElement(By.xpath("//a[text()='Multiple iframe']")).click();
		
		WebElement Iframe = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		driver.switchTo().frame(Iframe);
		
		driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
		
		driver.switchTo().defaultContent();
		
		WebElement IframeSecond = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[2]"));
		driver.switchTo().frame(IframeSecond);
		
		driver.findElement(By.id("username")).sendKeys("Admin@gmail.com");
		
		
		
		

	}

}
