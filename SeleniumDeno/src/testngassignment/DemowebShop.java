package testngassignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemowebShop {

	public DemowebShop(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	@FindBy(linkText = "Log in")
	private WebElement loginLinkText;

	@FindBy(id = "Email")
	private WebElement emailTextBox;

	@FindBy(id = "Password")
	private WebElement passwordTextBox;

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;

	@FindBy (partialLinkText = "BOOKS")
	private WebElement booksLink;

	@FindBy(linkText = "Log out")
	private WebElement logoutLinkText;

	public WebElement getLoginLinkText() {
		return loginLinkText;
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

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getLogoutLinkText() {
		return logoutLinkText;
	}

}
