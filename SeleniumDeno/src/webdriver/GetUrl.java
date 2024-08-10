package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrl {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.equals("https://www.instagram.com/"))
		{
			System.out.println("Url is Validated");
		}
		else
		{
			System.out.println("Url is not able to Validated");
		}
		

	}

}
