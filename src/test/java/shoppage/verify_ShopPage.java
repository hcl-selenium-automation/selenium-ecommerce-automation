package shoppage;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;

public class verify_ShopPage extends BaseTest {
	
	ShopPage page;
  @Test
  public void verify_Shoppage() {
	  page = new ShopPage(DriverFactory.getDriver());
	  page.clickShop();
	  
	  Assert.assertTrue(page.headDisplay());
  }
}
