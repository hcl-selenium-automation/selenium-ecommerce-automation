package registration;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;
import home.Home;
import utils.ExcelUtil;

public class RegistrationTest extends BaseTest {
	@DataProvider(name = "Registration")
	    public Object[][] getData() throws Exception {
	        return ExcelUtil.getTestData("C:\\Users\\riyaj\\Downloads\\registration.xlsx", "Sheet1");
	    }

	@Test(dataProvider = "Registration")
  public void verify_Registration(String name, String email, String password, String confirmPassword) {
		if(name.equals("EMPTY")) name = "";
	    if(email.equals("EMPTY")) email = "";
	    if(password.equals("EMPTY")) password = "";
	    if(confirmPassword.equals("EMPTY")) confirmPassword = "";
		Home h = new Home(driver);
		Registration r = h.clickRegisterPage();
	  r.enterName(name);
	  r.enterEmail(email);
	  r.enterPassword(password);
	  r.enterConfirmPass(confirmPassword);
	  r.clickRegisterBtn();
	  
	  r.clickLoginPage();
  }
}
