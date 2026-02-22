package order_success;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import base.BasePage;

public class OrderSuccess extends BasePage {

    public OrderSuccess(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[contains(text(),'Order Successful')]")
    private WebElement orderSuccessMessage;

    public boolean isOrderSuccessMessageDisplayed() {
        return orderSuccessMessage.isDisplayed();
    }
}
