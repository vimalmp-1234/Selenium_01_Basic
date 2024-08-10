package assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment35 {

	public static void main(String[] args) throws IOException {
		FileInputStream files= new FileInputStream("./TestData/LoginandUrl.properties");
		Properties prop= new Properties();
		prop.load(files);
		String url = prop.getProperty("insta");
		String user = prop.getProperty("email");
		String password = prop.getProperty("pwd");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).submit();

	}

}
