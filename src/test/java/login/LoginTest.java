package login;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;
import config.ConfigReader;

public class LoginTest extends BaseTest{
	private Login login;

	@BeforeClass
	public void initPages() {
		login = new Login(DriverFactory.getDriver());
	}

	@Test(description = "login page test section here",priority = 1)
	public void testClickLoginButton() {
		login.clickSignInIcon();
	}
	@Test(description = "login page test section here",priority = 2, dependsOnMethods ="testClickLoginButton" )
	public void testLoginUser() {
		String email=ConfigReader.get("email");
		String password=ConfigReader.get("password");
        login.loginUser(email, password);
	}
}
