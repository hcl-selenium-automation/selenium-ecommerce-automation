package cart_page;



import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;

public class Verify_ProductDisplay extends BaseTest {

	private AddToCart cart;
	
		
	@Test
	public void productDisplay() {

	    cart = new AddToCart(DriverFactory.getDriver());

	    cart.openCart();

	    boolean productPresent = cart.isProductPresent();

	    Assert.assertTrue(productPresent, "No products found in cart");
	}
}
