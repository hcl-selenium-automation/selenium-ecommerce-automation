package shoppage;

import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;
import cart_page.AddToCart;

public class validate_product2 extends BaseTest {

	ProductSelect product;
	AddToCart cart;
	
	@Test
	public void validateProduct() {
		product = new ProductSelect(DriverFactory.getDriver());
		product.clickViewDetail();
		
		product.clickaddToCart();
		
		cart = new AddToCart(DriverFactory.getDriver());
		cart.openCart();
		
		
	}
}
