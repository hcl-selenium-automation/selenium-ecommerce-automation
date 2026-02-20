package home;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;

public class LogoTest extends BaseTest{
	private Logo logo;
	@BeforeClass
	public void initPages() {
		logo = new Logo(DriverFactory.getDriver());
	}
	
	@Test(description = "home page test section here")
	public void testAbout() {
		 Assert.assertTrue(logo.verifyWebsiteLogo(),"logo can't displayed!");
	}
}
