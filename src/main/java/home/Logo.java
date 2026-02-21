package home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class Logo extends BasePage{

	public Logo(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//a[normalize-space()='FUSION ELECTRONICS']")private WebElement verify_logo;
	public boolean verifyWebsiteLogo() {
		return verify_logo.isDisplayed();
	}
}
