package checkout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class ShowSelectedItem extends BasePage{
	public ShowSelectedItem(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//button[@type='button']//*[name()='svg']")private WebElement show_selected_item_btn;
	public void verifyCheckoutPageLoad() {
		show_selected_item_btn.click();
	}
}
