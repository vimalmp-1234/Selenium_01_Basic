package testng;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ImplementationListeners implements ITestListener
{

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Login page is not dispayed and its failed",true);
		
	}
	

}
