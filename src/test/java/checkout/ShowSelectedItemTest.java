package checkout;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import about.ViewAbout;
import base.BaseTest;
import base.DriverFactory;

public class ShowSelectedItemTest extends BaseTest{
	private ShowSelectedItem showSelectedItem;
	@BeforeClass
	public void initPages() {
		showSelectedItem = new ShowSelectedItem(DriverFactory.getDriver());
	}
	
	@Test(description = "checkout page test section here")
	public void verifyCheckoutPageLoadTest() {
		 showSelectedItem.verifyCheckoutPageLoad();
	}
}
