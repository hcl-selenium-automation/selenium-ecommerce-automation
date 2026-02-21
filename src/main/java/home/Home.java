package home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class Home extends BasePage{

	public Home(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//a[@aria-label='Home']//*[name()='svg']")private WebElement home;
	public void openHomePage() {
		home.click();
	}
}
