package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		//step1 create FileInputStream object
		FileInputStream fil=new FileInputStream("./TestData/LoginandUrl.properties");
		
		//step2 create respective file type object
		Properties prop = new Properties();
		
		//step3 Call read methods
		prop.load(fil);
		String URL = prop.getProperty("insta");
		String EMAIL = prop.getProperty("email");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		
		
		System.out.println(URL);
		System.out.println(EMAIL);

	}

}
