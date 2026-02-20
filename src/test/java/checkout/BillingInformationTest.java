package checkout;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import about.ViewAbout;
import base.BaseTest;
import base.DriverFactory;
import config.ConfigReader;

public class BillingInformationTest extends BaseTest{
	private BillingInformation billingInformation;
	@BeforeClass
	public void initPages() {
		billingInformation = new BillingInformation(DriverFactory.getDriver());
	}
	
	@Test(description = "checkout page test section here")
	public void billingInformationTest() {
		String full_name=ConfigReader.get("full-name");
		String email_address=ConfigReader.get("email-address");
		billingInformation.billingInformation(full_name, email_address);
	}
	
	@Test(description = "checkout page test section here")
	public void shippingInformationTest() {
		String shipping_address=ConfigReader.get("shipping-address");
		billingInformation.shippingAddress(shipping_address);
	}
	
	@Test(description = "checkout page test section here")
	public void paymentDetailsTest() {
		String card_number=ConfigReader.get("card-number");
		String card_name=ConfigReader.get("card-name");
		String expiry_date=ConfigReader.get("expiry-date");
		String cvc=ConfigReader.get("cvc");
		billingInformation.paymentDetails(card_number, card_name, expiry_date, cvc);
	}
	
	@Test(description = "checkout page test section here")
	public void placeOrderTest() {
		billingInformation.placeOrder();
	}
}
