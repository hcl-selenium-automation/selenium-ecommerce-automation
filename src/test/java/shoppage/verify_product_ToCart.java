package shoppage;

import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;

public class verify_product_ToCart extends BaseTest{

	ProductSelect product;
	
	@Test
	public void verifyproductToCart() {
		product = new ProductSelect(DriverFactory.getDriver());
		product.clickaddToCart();
	}
}
