package home;

<<<<<<< HEAD
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
=======
import org.testng.annotations.Test;

import base.BaseTest;

public class HomeTest extends BaseTest {
	@Test
	public void verify_Registration() {
	    Home h = new Home(driver);
	    h.clickRegisterPage();
	}
}

>>>>>>> 2a746d6 (add login and registration)
