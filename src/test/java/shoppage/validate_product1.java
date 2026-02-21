package shoppage;

import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;

public class validate_product1 extends BaseTest {

	ProductSelect product;
	
	@Test
	public void validateProduct() {
		product = new ProductSelect(DriverFactory.getDriver());
		product.clickHeadPhone();
		
	}
}
