package cart_page;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;
import shoppage.ShopPage;

public class verify_browseProduct extends BaseTest {

AddToCart cart;
ShopPage shop;
	
	@Test
	public void browseproduct() {
		cart = new AddToCart(DriverFactory.getDriver());
		cart.browseMore();
		
		shop = new ShopPage(DriverFactory.getDriver());
		
		boolean head = shop.headDisplay();
		
		Assert.assertTrue(head);
	}	
}
