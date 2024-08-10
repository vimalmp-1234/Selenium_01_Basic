package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		//step1 create FileInputStream object
		FileInputStream filepath = new FileInputStream("./TestData/Login.xlsx");

		//step2 create respective file type object
		Workbook Workbook = WorkbookFactory.create(filepath);

		//step3 Call read methods
		String url = Workbook.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		System.out.println(url);

		String email = Workbook.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		System.out.println(email);

		String pwd = Workbook.getSheet("login").getRow(1).getCell(2).getStringCellValue();
		System.out.println(pwd);

		double Price = Workbook.getSheet("login").getRow(1).getCell(6).getNumericCellValue();
		System.out.println(Price);

		boolean Status = Workbook.getSheet("login").getRow(1).getCell(7).getBooleanCellValue();
		System.out.println(Status);

		LocalDateTime date = Workbook.getSheet("login").getRow(1).getCell(8).getLocalDateTimeCellValue();
		System.out.println(date);

//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.get(url);

	}

}
