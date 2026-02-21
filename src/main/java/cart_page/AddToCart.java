package cart_page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;
import utils.WaitUtils;

public class AddToCart extends BasePage {
	
	
	public AddToCart(WebDriver driver) {
		super(driver);// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//a[@aria-label='View cart']")
	WebElement cartBtn;
	
	@FindBy(xpath = "//button[normalize-space()='Continue shopping']")
	WebElement continueShop;

	@FindBy(xpath = "//button[normalize-space()='Browse products']")
	WebElement browseproduct;

	@FindBy(xpath = "//h6[normalize-space()='Your cart is empty.']")
	WebElement headCart;

	@FindBy(xpath = "//button[normalize-space()='Remove']")
	WebElement removeProduct;
	
	@FindBy(xpath = "//button[normalize-space()='Proceed to Checkout']")
	WebElement checkoutBtn;
	
	@FindBy(xpath = "//ul[@class='MuiList-root MuiList-padding css-1ontqvh']")
	List<WebElement> cartProducts;

	
	public void continueShopping() {
		wait.waitForElementToBeClickable(continueShop);
		continueShop.click();
	}
	
	public boolean checkHead() {
		wait.waitForElementToBeVisible(headCart);
		return headCart.isDisplayed();
	}
	
	public void browseMore() {
		wait.waitForElementToBeClickable(browseproduct);
		browseproduct.click();
	}
	
	public void removeItem() {
		wait.waitForElementToBeClickable(removeProduct);
		removeProduct.click();
	}
	
	public void goToCheckout() {
		wait.waitForElementToBeClickable(checkoutBtn);
		checkoutBtn.click();
	}
	
	public void openCart() {
		wait.waitForElementToBeClickable(cartBtn);
		cartBtn.click();
	}
	
	public boolean isProductPresent() {
	    return cartProducts.size() > 0;
	}
}
