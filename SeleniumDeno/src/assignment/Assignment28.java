package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment28 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement Iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(Iframe);
		
		WebElement Img1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement Img2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement Img3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement Img4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		WebElement Trash = driver.findElement(By.id("trash"));
		
		Actions Act = new Actions(driver);
		Act.scrollByAmount(0, 200).perform();
		Act.dragAndDrop(Img1, Trash).perform();
		Act.dragAndDrop(Img2, Trash).perform();
		Act.dragAndDrop(Img3, Trash).perform();
		Act.dragAndDrop(Img4, Trash).perform();
		
		Thread.sleep(2000);
		
		WebElement galleryTarget = driver.findElement(By.id("gallery"));
		Act.dragAndDrop(Img1, galleryTarget).perform();
		Act.dragAndDrop(Img2, galleryTarget).perform();
		Act.dragAndDrop(Img3, galleryTarget).perform();
		Act.dragAndDrop(Img4, galleryTarget).perform();

	}

}
