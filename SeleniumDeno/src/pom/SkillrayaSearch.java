package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillrayaSearch {
	public SkillrayaSearch(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "navbar-search-input")
	private WebElement searchTextFiled;

	public WebElement getSearchTextFiled() {
		return searchTextFiled;
	}
	
	


}
