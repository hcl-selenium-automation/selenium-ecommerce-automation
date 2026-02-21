package shoppage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;
import utils.WaitUtils;

	public class ShopPage extends BasePage {

	    public ShopPage(WebDriver driver) {
			super(driver);
			// TODO Auto-generated constructor stub
		}

	    @FindBy(xpath = "//a[@aria-label = 'Shop']")
	    WebElement shopBtn;

	    public void clickShop() {
	        wait.waitForElementToBeClickable(shopBtn);  
	        shopBtn.click();
	    }
	    
	    @FindBy(xpath = "//h4[normalize-space()='Shop']")
	    WebElement shopHead;
	    
	    public boolean headDisplay() {
	    	wait.waitForElementToBeVisible(shopHead);
	    	return shopHead.isDisplayed();
	    }
	
}
