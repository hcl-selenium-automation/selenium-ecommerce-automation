package cart_page;

import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;
import cart_page.AddToCart;

public class verify_ContinueShopping extends BaseTest{
	AddToCart cart;
	
	@Test
	public void continueShop() {
		cart = new AddToCart(DriverFactory.getDriver());
		cart.continueShopping();
	}
	
}
