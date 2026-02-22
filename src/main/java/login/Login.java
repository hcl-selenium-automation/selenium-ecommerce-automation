package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class Login extends BasePage {
	public Login(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//label[contains(text(),'Email')]/following::input[1]")
	WebElement email;
	
	public void enterEmail(String e) {
		email.sendKeys(e);
	}
	
	@FindBy(xpath="//label[contains(text(),'Password')]/following::input[@type='password'][1]")
	WebElement password;
	
	public void enterPassword(String p) {
		password.sendKeys(p);
	}
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement loginBtn;
	
	public void clickLoginBtn() {
		loginBtn.click();
	}
}
