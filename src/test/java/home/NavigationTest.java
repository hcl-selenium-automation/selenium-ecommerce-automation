package home;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;

public class NavigationTest extends BaseTest{
	private Navigation navigation;
	@BeforeClass
	public void initPages() {
		navigation = new Navigation(DriverFactory.getDriver());
	}

  @Test(priority = 1)
  public void clickAboutTest() {
      Assert.assertTrue(navigation.clickAbout(), "about icon not found!");
  }

  @Test(priority = 2)
  public void clickCartItemIconTest() {
	  Assert.assertTrue(navigation.clickCartItemIcon(), "cart item icon not found!");
  }

  @Test(priority = 3)
  public void clickCreateAccountIconTest() {
	  Assert.assertTrue(navigation.clickCreateAccountIcon(), "create account icon not found!");
  }

  @Test(priority = 4)
  public void clickHomeIconTest() {
	  Assert.assertTrue(navigation.clickHomeIcon(), "home icon not found!");
  }

  @Test(priority = 5)
  public void clickLogoTest() {
	  Assert.assertTrue(navigation.clickLogo(), "logo icon not found!");
  }

  @Test(priority = 6)
  public void clickShopIconTest() {
	  Assert.assertTrue(navigation.clickShopIcon(), "shop icon not found!");
  }

  @Test(priority = 7)
  public void clickSignInIconTest() {
	  Assert.assertTrue(navigation.clickSignInIcon(), "sign in icon not found!");
  }

  @Test(priority = 8)
  public void clickSupportIconTest() {
	  Assert.assertTrue(navigation.clickSupportIcon(), "support icon not found!");
  }
}
