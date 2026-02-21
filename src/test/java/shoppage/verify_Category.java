package shoppage;

import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;

public class verify_Category extends BaseTest{
	
	Category page;

	@Test
	public void verifyCategory() {
		page = new Category(DriverFactory.getDriver());
		
		page.clickComputers();
		page.clickElectronics();
	}
}
