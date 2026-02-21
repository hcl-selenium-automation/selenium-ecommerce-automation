package cart_page;

import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;

public class verify_checkOut extends BaseTest{
	AddToCart cart;
	
	@Test
	public void verifycheckout() {
		cart = new AddToCart(DriverFactory.getDriver());
		cart.goToCheckout();
		
		
	}

}
