package about;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.DriverFactory;

public class ViewAboutTest {
	private ViewAbout viewAbout;
	@BeforeClass
	public void initPages() {
		viewAbout = new ViewAbout(DriverFactory.getDriver());
	}
	
	@Test(description = "about page test section here")
	public void testAbout() {
		 viewAbout.viewAbout();
	}
}
