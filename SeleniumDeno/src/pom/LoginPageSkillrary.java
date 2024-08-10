package pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageSkillrary {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		FileInputStream filepath = new FileInputStream("./TestData/Login.xlsx");
	
		Workbook Workbook = WorkbookFactory.create(filepath);
	
		String url = Workbook.getSheet("login").getRow(2).getCell(0).getStringCellValue();
		String email = Workbook.getSheet("login").getRow(2).getCell(3).getStringCellValue();
		String pwd = Workbook.getSheet("login").getRow(2).getCell(4).getStringCellValue();
		driver.get(url);
		
		SkillraryLogin sl = new SkillraryLogin(driver);
		sl.getLoginLink().click();
		sl.getEmailTextBox().sendKeys(email);
		sl.getPasswordTextBox().sendKeys(pwd);
		sl.getLoginButton().click();

	}

}
