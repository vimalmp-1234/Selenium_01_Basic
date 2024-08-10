package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("register_Layer")).click();
		driver.findElement(By.xpath("//h2[text()=\"I'm experienced\"]")).click();
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\vikra\\eclipse-workspace\\SeleniumDeno\\resume\\VikramT_QA.pdf");

	}

}
