package assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment36 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream filepath = new FileInputStream("./TestData/Login.xlsx");
		Workbook workbook = WorkbookFactory.create(filepath);
		String url = workbook.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		String FirstName = workbook.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		String LastName = workbook.getSheet("login").getRow(1).getCell(2).getStringCellValue();
		String email = workbook.getSheet("login").getRow(1).getCell(3).getStringCellValue();
		String pwd = workbook.getSheet("login").getRow(1).getCell(4).getStringCellValue();
		String cfpwd = workbook.getSheet("login").getRow(1).getCell(5).getStringCellValue();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		
		driver.findElement(By.linkText("Register")).click();
		WebElement maleRadioButton = driver.findElement(By.id("gender-male"));
		maleRadioButton.click();
		driver.findElement(By.id("FirstName")).sendKeys(FirstName);
		driver.findElement(By.id("LastName")).sendKeys(LastName);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.name("Password")).sendKeys(pwd);
		driver.findElement(By.name("ConfirmPassword")).sendKeys(cfpwd);
		Thread.sleep(2000);
		WebElement Register = driver.findElement(By.id("register-button"));
		Register.click();
		

	}

}
