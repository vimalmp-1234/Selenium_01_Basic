package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Singleiframe {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.dream11.com/");
		
		//driver.switchTo().frame(0);//int index
		//driver.switchTo().frame("send-sms-iframe");//String name or Id
		
		WebElement FrameElement = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		driver.switchTo().frame(FrameElement);//WebElement FrameElement
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("887766554499");
		driver.findElement(By.xpath("//a[@id='regUser']")).click();
		WebElement Text = driver.findElement(By.id("errorMob"));
		System.out.println(Text.getText());
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("hamburger")).click();
		
//		driver.findElement(By.xpath("(//a[contains(text(),'Fantasy Cricket')])[4]")).click();
	}

}
