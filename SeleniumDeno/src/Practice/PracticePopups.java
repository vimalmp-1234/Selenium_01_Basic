package Practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticePopups {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.w3schools.com/js/js_popup.asp");

		// Store the original window handle
		String originalWindow = driver.getWindowHandle();

		// Open the first popup and handle it
		driver.findElement(By.xpath("//a[text()='Try it Yourself »']")).click();
		switchToNewWindow(driver, originalWindow);
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.close();

		// Switch back to the original window
		driver.switchTo().window(originalWindow);

		// Open the second popup and handle it
		driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]")).click();
		switchToNewWindow(driver, originalWindow);
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(2000);
		Alert confirm = driver.switchTo().alert();
		confirm.dismiss();
		WebElement textMsg = driver.findElement(By.xpath("//p[@id='demo']"));
		String msg = textMsg.getText();
		System.out.println("Confirm Msg is :- " + msg);
		driver.close();

		// Switch back to the original window
		driver.switchTo().window(originalWindow);

		// Open the third popup and handle it
		driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]")).click();
		switchToNewWindow(driver, originalWindow);
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(2000);
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("Hey Vikram here");
		prompt.accept();
		WebElement textsMsg = driver.findElement(By.xpath("//p[@id='demo']"));
		String msgs = textsMsg.getText();
		System.out.println("Prompt Msg is  :- " + msgs);
		driver.close();

		// Switch back to the original window
		driver.switchTo().window(originalWindow);
	}

	// Method to switch to a new window
	public static void switchToNewWindow(WebDriver driver, String originalWindow) {
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String handle : allWindowHandles) {
			if (!handle.equals(originalWindow)) {
				driver.switchTo().window(handle);
				break;
			}
		}
	}
}