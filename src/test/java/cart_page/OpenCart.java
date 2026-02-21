package cart_page;

import org.testng.annotations.Test;
import base.BaseTest;
import base.DriverFactory;

public class OpenCart extends BaseTest {

    AddToCart cart;

    @Test
    public void open_cart() {
        cart = new AddToCart(DriverFactory.getDriver());
        cart.openCart();
    }
}