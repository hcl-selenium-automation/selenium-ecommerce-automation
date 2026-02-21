package checkout;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;

public class ProceedToCheckOutTest extends BaseTest{
	private ProceedToCheckOut proceedToCheckOut;
	@BeforeClass
	public void initPages() {
		proceedToCheckOut = new ProceedToCheckOut(DriverFactory.getDriver());
	}
	@Test(description = "checkout page test section here",priority = 1)
	public void clickCartIconTest() {
		 proceedToCheckOut.clickCartItemIcon();
	}
	
	@Test(description = "checkout page test section here",priority = 2)
	public void proceedToCheckOutTest() {
		 proceedToCheckOut.proceedToCheckout();
	}
}
