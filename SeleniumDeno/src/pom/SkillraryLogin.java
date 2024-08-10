package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLogin 
{

	public SkillraryLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='LOGIN']")
	private WebElement loginLink;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailTextBox;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordTextBox;
	
	@FindBy(xpath = "//button[@id='last']")
	private WebElement loginButton;

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getEmailTextBox() {
		return emailTextBox;
	}

	public WebElement getPasswordTextBox() {
		return passwordTextBox;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	

}
