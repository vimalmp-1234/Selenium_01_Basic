package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment14 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		WebElement Selected = driver.findElement(By.xpath("//label[text()='Poor']/..//input[@type='radio']"));
		boolean CheckRadio = Selected.isSelected();
		if(Selected.isSelected())
		{
			System.out.println("Radio button is selected: " +CheckRadio);
		}
		else
		{
			System.out.println("Radio button is not selected: " +CheckRadio);
		}
		
		Selected.click();
		System.out.println("=========After click button is used==========");
		
		CheckRadio = Selected.isSelected();
		
		if(Selected.isSelected())
		{ 
			System.out.println("Radio button is selected: "+CheckRadio);
		}
		else
		{
			System.out.println("Radio button is not selected: "+CheckRadio);
		}
		
		//driver.quit();
		

	}

}
