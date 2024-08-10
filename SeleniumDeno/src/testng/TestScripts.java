package testng;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScripts extends BaseClass
{
@Test
public void ClickComputer()
{
	driver.findElement(By.partialLinkText("COMPUTERS")).click();
	Reporter.log("Computers screen should be dispayed",true);
}
}
