package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra"))
		{
			System.out.println("Myntra appliction is launched and Navigation to Myntra was successful");
		}
		else
		{
			System.out.println("Myntra appliction Not launched and Navigation to Myntra was not successful");
		}
		
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.equals("https://www.myntra.com/"))
		{
			System.out.println("Url validated successfully");
		}
		else
		{
			System.out.println("Url is not displayed");
		}
	}

}
