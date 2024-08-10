package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assginment8 {

	public static void main(String[] args){
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtextbox')]")).sendKeys("Mobiles");
		driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		WebElement Redmi =driver.findElement(By.xpath("//span[text()='Redmi']"));
		Redmi.click();
	}

}
