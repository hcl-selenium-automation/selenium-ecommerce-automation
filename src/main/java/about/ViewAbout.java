package about;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import base.BasePage;

public class ViewAbout extends BasePage{

	public ViewAbout(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//a[@aria-label='About']//*[name()='svg']")private WebElement view_about;
	public void viewAbout() {
		view_about.click();
	}

}
