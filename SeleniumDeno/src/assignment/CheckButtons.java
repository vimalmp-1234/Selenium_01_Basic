package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckButtons {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		List<WebElement> buttons = driver.findElements(By.tagName("button"));
		System.out.println(buttons.size());
		List<WebElement> alllLnks = driver.findElements(By.tagName("a"));
		System.out.println(alllLnks.size());
		List<WebElement> allImages = driver.findElements(By.tagName("img"));
		System.out.println(allImages.size());

	}

}
