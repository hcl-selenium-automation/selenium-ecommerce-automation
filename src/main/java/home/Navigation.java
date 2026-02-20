package home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class Navigation extends BasePage{

	public Navigation(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//a[normalize-space()='FUSION ELECTRONICS']")private WebElement logo_icon;
	@FindBy(xpath = "//a[@aria-label='Home']//*[name()='svg']")private WebElement home_icon;
	@FindBy(xpath = "//a[@aria-label='Shop']//*[name()='svg']")private WebElement shop_icon;
	@FindBy(xpath = "//a[@aria-label='About']//*[name()='svg']")private WebElement about_icon;
	@FindBy(xpath = "//a[@aria-label='Support']//*[name()='svg']")private WebElement support_icon;
	@FindBy(xpath = "//a[@aria-label='Sign in']//*[name()='svg']")private WebElement signin_icon;
	@FindBy(xpath = "//a[@aria-label='Create account']//*[name()='svg']")private WebElement create_accouont;
	@FindBy(xpath = "//a[@aria-label='View cart']")private WebElement cart__icon;
	
	public boolean clickLogo() {
		if(logo_icon.isDisplayed()) {
			logo_icon.click();
			return true;
		}
		return false;		
	}
	public boolean clickHomeIcon() {
		if(home_icon.isDisplayed()) {
			home_icon.click();
			return true;
		}
		return false;		
	}
	public boolean clickShopIcon() {
		if(shop_icon.isDisplayed()) {
			shop_icon.click();
			return true;
		}
		return false;		
	}
	
	public boolean clickAbout() {
		if(about_icon.isDisplayed()) {
			about_icon.click();
			return true;
		}
		return false;		
	}
	
	public boolean clickSupportIcon() {
		if(support_icon.isDisplayed()) {
			support_icon.click();
			return true;
		}
		return false;		
	}
	
	public boolean clickSignInIcon() {
		if(signin_icon.isDisplayed()) {
			signin_icon.click();
			return true;
		}
		return false;		
	}
	
	public boolean clickCreateAccountIcon() {
		if(create_accouont.isDisplayed()) {
			create_accouont.click();
			return true;
		}
		return false;		
	}
	
	public boolean clickCartItemIcon() {
		if(cart__icon.isDisplayed()) {
			cart__icon.click();
			return true;
		}
		return false;		
	}
}
