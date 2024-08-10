package testngassignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class DemoWeb {
	public static WebDriver driver;
	public Properties prop;
	public DemowebShop dws;

	@Parameters("Browser")
	@BeforeClass
	public void Pom(@Optional("chrome")  String browserName) throws IOException {
		FileInputStream filepath=new FileInputStream("./TestData/DemowebShop.properties");
		prop = new Properties();
		prop.load(filepath);
		String URL = prop.getProperty("url");

		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver= new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver= new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			driver= new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@BeforeMethod
	public void LoginPage() throws IOException
	{
		String EMAIL = prop.getProperty("email");
		String PWD = prop.getProperty("pwd");
		dws = new DemowebShop(driver);
		dws.getLoginLinkText().click();
		dws.getEmailTextBox().sendKeys(EMAIL);
		dws.getPasswordTextBox().sendKeys(PWD);
		dws.getLoginButton().click();
	}

	@AfterMethod
	public void LogoutPage()
	{
		dws.getLogoutLinkText();
	}

	@AfterClass
	public void ClosePage()
	{
		driver.quit();
	}

}
