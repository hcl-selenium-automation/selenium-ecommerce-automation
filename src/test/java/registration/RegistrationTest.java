package registration;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;
import config.ConfigReader;

public class RegistrationTest extends BaseTest {
	private Registration registration;

	@BeforeClass
	public void initPages() {
		registration = new Registration(DriverFactory.getDriver());
	}

	@Test(description = "registration page test section here",priority = 1)
	public void testRegisterButton() {
		registration.clickRegisterPage();
	}
	@Test(description = "registration page test section here",dependsOnMethods = "testRegisterButton",priority = 2)
	public void testRegisterUser() {
		String name=ConfigReader.get("name");
		String email=ConfigReader.get("email");
		String password=ConfigReader.get("password");
		String cpassword=ConfigReader.get("cpassword");
        registration.registerUser(name, email, password, cpassword);
	}
}
