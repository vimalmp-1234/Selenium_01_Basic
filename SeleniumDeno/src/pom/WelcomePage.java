package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	//Instialization
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}
	//Declarations
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	
	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	
	@FindBy(linkText = "Shopping cart")
	private WebElement shoppingLink;
	
	@FindBy(linkText = "Wishlist")
	private WebElement wishlistLink;

	
	public WebElement getShoppingLink() {
		return shoppingLink;
	}


	public WebElement getLoginLink() {
		return loginLink;
	}


	//Getters
	public WebElement getRegisterLink() {
		return registerLink;
	}


	public WebElement getWishlistLink() {
		return wishlistLink;
	}

	}

