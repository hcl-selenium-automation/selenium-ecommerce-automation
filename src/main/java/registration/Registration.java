package registration;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BasePage;
import login.Login;

public class Registration extends BasePage {
	public Registration(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//label[contains(text(),'Name')]/following::input[1]")
	WebElement name;
	
	public void enterName(String n) {
		wait.waitForElementToBeVisible(name);
		name.clear();
		name.sendKeys(n);
	}
	
	@FindBy(xpath="//label[contains(text(),'Email')]/following::input[1]")
	WebElement email;
	
	public void enterEmail(String e) {
		wait.waitForElementToBeVisible(email);
		email.clear();
		email.sendKeys(e);
	}
	
	@FindBy(xpath="//label[contains(text(),'Password')]/following::input[@type='password'][1]")
	WebElement password;
	
	public void enterPassword(String p) {
		wait.waitForElementToBeVisible(password);
		password.clear();
		password.sendKeys(p);
	}
	
	@FindBy(xpath="//label[contains(text(),'Confirm Password')]/following::input[@type='password'][1]")
	WebElement confirmPass;
	
	public void enterConfirmPass(String p) {
		wait.waitForElementToBeVisible(confirmPass);
		confirmPass.clear();
		confirmPass.sendKeys(p);
	}
	
	@FindBy(xpath="//button[normalize-space()='Register']")
	WebElement registerBtn;
	
	public void clickRegisterBtn() {
	    wait.waitForElementToBeClickable(registerBtn);

	    Actions actions = new Actions(driver);
	    actions.moveToElement(registerBtn).click().perform();
	}
	
	@FindBy(xpath="//*[name()='path' and contains(@d,'M11 7 9.6 ')]")
	WebElement loginPage;
	
	public Login clickLoginPage() {
	   wait.waitForElementToBeClickable(loginPage);
	   loginPage.click();
	    return new Login(driver);
	}
}
