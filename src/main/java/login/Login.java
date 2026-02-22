package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class Login extends BasePage {
	public Login(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[@aria-label='Sign in']//*[name()='svg']")private WebElement signin_button;
	@FindBy(xpath="//label[contains(text(),'Email')]/following::input[1]")
	WebElement email;
	@FindBy(xpath="//label[contains(text(),'Password')]/following::input[@type='password'][1]")
	WebElement password;
	@FindBy(xpath = "//button[normalize-space()='Login']")private WebElement login_btn;
	public boolean clickSignInIcon() {
		if(signin_button.isDisplayed()) {
			signin_button.click();
			return true;
		}
		return false;		
	}
	public void loginUser(String e,String p) {
		email.clear();
		password.clear();
		email.sendKeys(e);
		password.sendKeys(p);
		login_btn.submit();
	}	
}
