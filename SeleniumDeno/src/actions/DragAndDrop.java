package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement Iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(Iframe);
		
		WebElement Img1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement Trash = driver.findElement(By.id("trash"));
		
		Actions Act = new Actions(driver);
		Act.scrollByAmount(0, 200).perform();
		Act.dragAndDrop(Img1, Trash).perform();
		
		Thread.sleep(2000);
		
		WebElement galleryTarget = driver.findElement(By.id("gallery"));
		Act.dragAndDrop(Img1, galleryTarget).perform();

	}

}
