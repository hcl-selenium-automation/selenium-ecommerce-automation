package registration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class Registration extends BasePage {
	public Registration(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//a[@aria-label='Create account']//*[name()='svg']")
	private WebElement register_icon;
	
	public void clickRegisterPage() {
		register_icon.click();
	}
	@FindBy(xpath = "//label[contains(text(),'Name')]/following::input[1]")private WebElement name;
	@FindBy(id = "//label[contains(text(),'Email')]/following::input[1]")private WebElement email;
	@FindBy(id = "//label[contains(text(),'Password')]/following::input[@type='password'][1]")private WebElement password;
	@FindBy(id="//label[contains(text(),'Confirm Password')]/following::input[@type='password'][1]")private WebElement confirm_password;
	@FindBy(xpath = "//button[normalize-space()='Register']")private WebElement register_button;
	public void registerUser(String n,String e,String p,String cp) {
		name.clear();
		email.clear();
		password.clear();
		confirm_password.clear();
		name.sendKeys(n);
		email.sendKeys(e);
		password.sendKeys(p);
		confirm_password.sendKeys(cp);
		register_button.submit();
	}
}
