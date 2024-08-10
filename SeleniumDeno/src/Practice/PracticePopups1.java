package Practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticePopups1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.w3schools.com/js/js_popup.asp");

		driver.findElement(By.xpath("//a[text()='Try it Yourself »']")).click();

		Set<String> windowhandles = driver.getWindowHandles();
		Iterator<String> iterator = windowhandles.iterator();
		String parentWindow = iterator.next();
		String childWindow = iterator.next();
		driver.switchTo().window(childWindow);
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(2000);
		Alert Alert = driver.switchTo().alert();
		Alert.accept();
		driver.close();

		driver.switchTo().window(parentWindow);	
		driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]")).click();
		
		windowhandles = driver.getWindowHandles();
		iterator = windowhandles.iterator();
		parentWindow = iterator.next();
		childWindow = iterator.next();
		driver.switchTo().window(childWindow);
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(2000);
		Alert Confirm = driver.switchTo().alert();
		Confirm.dismiss();	
		WebElement TextMsg = driver.findElement(By.xpath("//p[@id='demo']"));
		String msg = TextMsg.getText();
		System.out.println("Comfirm Message  :- " + msg);
		driver.close();

		driver.switchTo().window(parentWindow);
		driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]")).click();
		
		windowhandles = driver.getWindowHandles();
		iterator = windowhandles.iterator();
		parentWindow = iterator.next();
		childWindow = iterator.next();
		driver.switchTo().window(childWindow);
		
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
		driver.switchTo().window(parentWindow);
	}

}
