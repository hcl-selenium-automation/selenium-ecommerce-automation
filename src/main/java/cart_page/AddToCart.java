package cart_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class AddToCart extends BasePage {

	public AddToCart(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[@aria-label='View cart']")
	WebElement cartBtn;

	public void openCart() {
		cartBtn.click();
	}
}
