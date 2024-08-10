package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment30 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.w3schools.com/js/js_popup.asp");

		driver.findElement(By.xpath("//a[text()='Try it Yourself »']")).click();
		String originalWindow = driver.getWindowHandle();

		Set<String> allWindowIds = driver.getWindowHandles();

		for (String id : allWindowIds)
		{
			if (!id.equals(originalWindow)) 
			{
				driver.switchTo().window(id);
			}
		}

		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(2000);
		Alert Alert = driver.switchTo().alert();
		Alert.accept();
		driver.close();

		driver.switchTo().window(originalWindow);

		driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]")).click();
		String originalWindow2 = driver.getWindowHandle();
		Set<String> allWindowIds2 = driver.getWindowHandles();
		for (String id : allWindowIds2)
		{
			if (!id.equals(originalWindow2)) 
			{
				driver.switchTo().window(id);
			}
		}

		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(2000);
		Alert Confirm = driver.switchTo().alert();
		Confirm.dismiss();

		WebElement TextMsg = driver.findElement(By.xpath("//p[@id='demo']"));
		String msg = TextMsg.getText();
		System.out.println("Comfirm Message  :- " + msg);
		driver.close();

		driver.switchTo().window(originalWindow);

		driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]")).click();
		String originalWindow3 = driver.getWindowHandle();
		Set<String> allWindowIds3 = driver.getWindowHandles();
		for (String id : allWindowIds3)
		{
			if (!id.equals(originalWindow3)) 
			{
				driver.switchTo().window(id);
			}
		}

		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(2000);
		Alert Prompt = driver.switchTo().alert();
		Prompt.sendKeys("Hey Vikram here");
		Prompt.accept();

		WebElement TextsMsg = driver.findElement(By.xpath("//p[@id='demo']"));
		String msgs = TextsMsg.getText();
		System.out.println("Prompt Message  :- " + msgs);
		driver.close();

	}

}
