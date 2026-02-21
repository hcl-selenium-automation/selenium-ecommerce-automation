package cart_page;

import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;

public class verify_removeProduct extends BaseTest {
	AddToCart cart;
	
	@Test
	public void removeproduct() {
		cart = new AddToCart(DriverFactory.getDriver());
		cart.removeItem();
	}
}
