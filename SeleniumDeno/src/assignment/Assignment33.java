package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment33 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		driver.findElement(By.id("browserButton3")).click();
		
		switchtowindow(driver, "SignUpPage");
		driver.findElement(By.id("email")).sendKeys("viki@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Viki@321");
		driver.findElement(By.id("confirm-password")).sendKeys("viki@321");
		driver.manage().window().minimize();
		
		switchtowindow(driver, "SignUp");
		driver.findElement(By.id("username")).sendKeys("viki4321");
		driver.findElement(By.id("email")).sendKeys("Viki@gmail.com");
		driver.findElement(By.id("password")).sendKeys("viki@321");
		driver.manage().window().minimize();
		
		switchtowindow(driver, "Login");
		driver.findElement(By.id("username")).sendKeys("Viki4321");
		driver.findElement(By.id("password")).sendKeys("viki@321");
		driver.manage().window().minimize();
		
		Thread.sleep(2000);
		switchtowindow(driver, "SignUpPage");
		driver.close();
		
		Thread.sleep(2000);
		switchtowindow(driver, "SignUp");
		driver.close();
		
		Thread.sleep(2000);
		switchtowindow(driver, "Login");
		driver.close();
		
		driver.quit();
	}

	public static void switchtowindow(WebDriver driver, String Expwindow)
	{
		Set<String> allwindows = driver.getWindowHandles();
		for(String id:allwindows)
		{
			String url = driver.switchTo().window(id).getCurrentUrl();
			if(url.contains(Expwindow))
			{
				break;
			}
		}
	}

}


