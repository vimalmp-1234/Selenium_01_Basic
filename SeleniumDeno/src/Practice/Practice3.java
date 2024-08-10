package Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {

	public static void main(String[] args) throws InterruptedException {
        
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

       
        WebElement login = driver.findElement(By.id("loginspan"));
        login.click();
        Thread.sleep(2000); 
        driver.findElement(By.name("username")).sendKeys("vikram@gmail.com");
        driver.findElement(By.name("password")).sendKeys("vikeam123"); // Corrected password
        driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	}

}
