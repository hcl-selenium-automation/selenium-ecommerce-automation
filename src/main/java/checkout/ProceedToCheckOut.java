package checkout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class ProceedToCheckOut extends BasePage{

	public ProceedToCheckOut(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//a[@aria-label='View cart']")private WebElement cart__icon;
	@FindBy(xpath="//button[normalize-space()='Proceed to Checkout']")private WebElement proceed_to_checkout;
	public boolean clickCartItemIcon() {
		if(cart__icon.isDisplayed()) {
			cart__icon.click();
			return true;
		}
		return false;		
	}
	
	public void proceedToCheckout() {
		proceed_to_checkout.click();
	}

}
