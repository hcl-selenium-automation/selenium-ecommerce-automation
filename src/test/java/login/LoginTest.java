package login;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import home.Home;
import registration.Registration;
import utils.ExcelUtil;

public class LoginTest extends BaseTest{
	@DataProvider(name = "Login")
	public Object[][] getData() throws Exception {
	    return ExcelUtil.getTestData(
	        "C:\\Users\\riyaj\\Downloads\\LoginData.xlsx",
	        "Sheet1"
	    );
	}
	@Test(dataProvider = "Login")
	public void verify_Login(String email, String password) {
		if(email.equals("EMPTY")) email = "";
	    if(password.equals("EMPTY")) password = "";
		
	    Home h = new Home(driver);
	    Registration r = h.clickRegisterPage();
	    Login l = r.clickLoginPage(); // now correct driver
	    l.enterEmail(email);
	    l.enterPassword(password);
	    l.clickLoginBtn();
	}
}
