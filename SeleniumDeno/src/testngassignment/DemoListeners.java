package testngassignment;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class DemoListeners extends DemoWeb implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test Scrips is failed",true);
		
		String MethodName = result.getName();
		String SystemTime = LocalDateTime.now().toString().replace(":", "-");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/"+MethodName+SystemTime+".png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test Scrips is Passed",true);
		
		String SystemTime = LocalDateTime.now().toString().replace(":", "-");
		String SuccessMethod = result.getName();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/"+SuccessMethod+SystemTime+".png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
	
}
