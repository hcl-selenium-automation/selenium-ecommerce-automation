package home;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;

public class HomeTest extends BaseTest{
	private Home home;
	@BeforeClass
	public void initPages() {
		home = new Home(DriverFactory.getDriver());
	}
	
	@Test(description = "about page test section here")
	public void testAbout() {
		 home.openHomePage();
	}
}
