package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		String title = driver.getTitle();
		System.out.println(title);
			if(title.equals("Instagram")) {
			System.out.println("user validated");
		}
		else
		{
			System.out.println("user not able to validate");
		}
			
		

	}

}
