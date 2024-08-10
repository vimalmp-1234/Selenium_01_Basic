package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ImplementationListeners.class)
public class TestScriptListeners 
{
	
	@Test
	public void login()
	{
		Reporter.log("Open the browser",true);
		Reporter.log("Navigate to url",true);
		Reporter.log("Click on login link",true);
		Reporter.log("Enter email",true);
		Reporter.log("Enter password",true);
		Reporter.log("Click on login button",true);
		Assert.assertEquals(true, false);
	}

}
