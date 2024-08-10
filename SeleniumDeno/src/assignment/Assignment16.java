package assignment;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment16 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");

		driver.findElement(By.xpath("//a[text()='Vtiger']")).click();
		Thread.sleep(3000);

		String originalWindow = driver.getWindowHandle();

		Set<String> allWindowIds = driver.getWindowHandles();

		for (String id : allWindowIds)
		{
			if (!id.equals(originalWindow)) 
			{
				driver.switchTo().window(id);
			}
		}

		driver.findElement(By.id("loginspan")).click();

		Thread.sleep(2000); 
		driver.findElement(By.name("username")).sendKeys("vikram@gmail.com");
		driver.findElement(By.name("password")).sendKeys("vikeam123"); 
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();

		Thread.sleep(2000);

		String SystemTime = LocalDateTime.now().toString().replace(":", "-");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/Webpage"+SystemTime+".png");
		FileHandler.copy(temp, dest);
		driver.close();

		driver.switchTo().window(originalWindow);

		WebElement Username = driver.findElement(By.id("username"));
		WebElement Password = driver.findElement(By.id("password"));
		WebElement Action = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		Username.clear();
		Username.sendKeys("Vikram");
		Password.clear();
		Password.sendKeys("Vikram@12");
		Action.submit();

		WebElement Msg = driver.findElement(By.xpath("//span[@id='validationMessage']"));

		File Element = Msg.getScreenshotAs(OutputType.FILE);
		File dests = new File("./screenshots/element"+SystemTime+".png");
		FileHandler.copy(Element, dests);

		String Text = Msg.getText();
		String color = Msg.getCssValue("color");
		String display = Msg.getCssValue("display");
		String textalign = Msg.getCssValue("text-align");
		String padding = Msg.getCssValue("padding");
		System.out.println(Text);
		System.out.println(color);
		System.out.println(display);
		System.out.println(textalign);
		System.out.println(padding);

	}

}
