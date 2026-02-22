package home;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;

public class HomeTest extends BaseTest {
	private Home home;

	@BeforeClass
	public void initPages() {
		home = new Home(DriverFactory.getDriver());
	}

	@Test(description = "home page test section here")
	public void testHomePage() {
		home.clickHomeIcon();
	}
}
