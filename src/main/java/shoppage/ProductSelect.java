package shoppage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class ProductSelect extends BasePage{

	
	
	public ProductSelect(WebDriver driver) {
		super(driver);// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//img[@alt='Sony WH-CH710N Headphones']")
	WebElement headphone;
	
	public void clickHeadPhone() {
		wait.waitForElementToBeClickable(headphone);
		headphone.click();
	}


	@FindBy(xpath = "//button[normalize-space()='Add to Cart']")
	WebElement addToCartBtn;

	public void clickaddToCart() {
		wait.waitForElementToBeClickable(addToCartBtn);
		addToCartBtn.click();
	}
	
	@FindBy(xpath = "//body/div[@id='root']/main[@class='MuiBox-root css-3mujz1']/div[@class='MuiContainer-root MuiContainer-maxWidthXl css-1sb11ge']/div[@class='MuiContainer-root MuiContainer-maxWidthMd css-br0b9d']/div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation3 css-1nslcek']/div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-3 css-1h77wgb']/div[2]")
	WebElement productDetails;
	

	public boolean viewDetails() {
		wait.waitForElementToBeVisible(productDetails);
		return productDetails.isDisplayed();
		}
	
	public String  getDetails() {
		wait.waitForElementToBeVisible(productDetails);
		return productDetails.getText();
		}
	
	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Add to Cart'])[1]")
	WebElement addToCart;
	
	public void directCart() {
		wait.waitForElementToBeClickable(addToCart);
		addToCart.click();
	}
	
	@FindBy(xpath = "(//button[@aria-label='See full specs'][normalize-space()='View Details'])[1]")
	WebElement viewDetailBtn;
	
	public void clickViewDetail() {
		wait.waitForElementToBeClickable(viewDetailBtn);
		viewDetailBtn.click();
	}
	
}
