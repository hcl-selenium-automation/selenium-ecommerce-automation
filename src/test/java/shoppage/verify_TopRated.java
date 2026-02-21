package shoppage;

import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;

public class verify_TopRated extends BaseTest {
	FilterProduct filter;
	
	@Test
	public void verifyTopRated() {
		filter = new FilterProduct(DriverFactory.getDriver());
		filter.clickFilter();
		filter.filter_topRated();
	}
}
