package order_success;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;

public class OrderSuccessTest extends BaseTest {

    private OrderSuccess orderSuccess;

    @BeforeClass
    public void initPages() {
        orderSuccess = new OrderSuccess(DriverFactory.getDriver());
    }

    @Test(description = "TC_53 - Verify Order Successful message")
    public void verifyOrderSuccessMessageTest() {

        Assert.assertTrue(
            OrderSuccessTest.isOrderSuccessMessageDisplayed(),
            "Order Successful message is not displayed!"
        );
    }
}