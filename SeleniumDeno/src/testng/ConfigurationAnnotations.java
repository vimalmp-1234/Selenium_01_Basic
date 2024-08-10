package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotations {
	
	@BeforeSuite
	public void BeforeSuite()
	{
		Reporter.log("Before Suite is pre conditions Executed",true);
	}
	@BeforeTest
	public void BeforeTest()
	{
		Reporter.log("Before Test is Executed");
	}
	@BeforeClass
	public void BeforeClass()
	{
		Reporter.log("Before Class is executed", true);
	}
	@BeforeMethod
	public void BeforeMethod()
	{
		Reporter.log("Before Method is executed", true);
	}
	
	@Test
	public void TestCase1()
	{
		Reporter.log("TestCase scprits 1 is executed",true);
	}
	@Test
	public void TestCase2()
	{
		Reporter.log("TestCase scprits 2 is executed",true);
	}
	@Test
	public void TestCase3()
	{
		Reporter.log("TestCase scprits 3 is executed",true);
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		Reporter.log("AfterMethod is Executed",true);
	}
	
	@AfterClass
	public void AfterClass()
	{
		Reporter.log("After Class is Executed", true);
	}
	
	@AfterTest
	public void AfterTest()
	{
		Reporter.log("After Test is Executed", true);
	}
	
	
	@AfterSuite
	public void AfterSuite()
	{
		Reporter.log("After Suite is post condition Executed",true);
	}

}
