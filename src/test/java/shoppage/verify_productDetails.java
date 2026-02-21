package shoppage;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;

public class verify_productDetails extends BaseTest {
ProductSelect product;
	
	@Test
	public void verifyproductToCart() {
		product = new ProductSelect(DriverFactory.getDriver());
		System.out.println(product.getDetails());
		boolean detail = product.viewDetails();
		
		Assert.assertTrue(detail);
	}

}
