package checkout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import base.BasePage;
public class BillingInformation extends BasePage{
	public BillingInformation(WebDriver driver) {
		super(driver);
	}
	@FindBy(id = "name")private WebElement name;
	@FindBy(id = "email")private WebElement email;
	@FindBy(id = "shippingAddress")private WebElement shipping_address;
	@FindBy(id = "cardNumber")private WebElement card_number;
	@FindBy(id = "cardName")private WebElement card_name;
	@FindBy(id = "expiry")private WebElement expiry_date;
	@FindBy(id = "cvc")private WebElement cvc;
	@FindBy(xpath = "//button[normalize-space()='Place Order']")private WebElement place_order;
	public void billingInformation(String n,String e) {
		name.clear();
		email.clear();
		name.sendKeys(n);
		email.sendKeys(e);
	}
	public void shippingAddress(String addr) {
		shipping_address.clear();
		shipping_address.sendKeys(addr);
	}
	
	public void paymentDetails(String cnumber,String cname,String edate,String cv) {
		card_number.clear();
		card_name.clear();
		expiry_date.clear();
		cvc.clear();
		card_number.sendKeys(cnumber);
		card_name.sendKeys(cname);
		expiry_date.sendKeys(edate);
		cvc.sendKeys(cv);
	}
	
	public void placeOrder() {
		place_order.submit();
	}
}
