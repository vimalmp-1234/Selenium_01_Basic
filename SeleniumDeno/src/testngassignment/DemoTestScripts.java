package testngassignment;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class DemoTestScripts extends DemoWeb
{
	@Test
	public void CheckBooks() throws InterruptedException 
	{
		dws.getBooksLink().click();
		Thread.sleep(2000);
		WebElement StorBy = driver.findElement(By.id("products-orderby"));
		Select AtoZ = new Select(StorBy);
		AtoZ.selectByIndex(1);
		Reporter.log("AtoZ is selected in StorBy DropDown",true);
	}

}
