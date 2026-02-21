package shoppage;

import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;
import cart_page.AddToCart;

public class verify_directToCart extends BaseTest {
	ProductSelect product;
	AddToCart cart;
	
	
	@Test
	public void directCart() {
		product = new ProductSelect(DriverFactory.getDriver());
		product.directCart();
		cart = new AddToCart(DriverFactory.getDriver());
		cart.openCart();
	}
	
}
