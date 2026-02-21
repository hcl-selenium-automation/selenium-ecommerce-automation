package shoppage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class FilterProduct extends BasePage {

	public FilterProduct(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//div[@id='sort-select']")
	WebElement filterCategory;
	
	@FindBy(xpath = "//li[normalize-space()='Price: Low to High']")
	WebElement low_high;
	
	@FindBy(xpath = "//li[normalize-space()='Price: High to Low']")
	WebElement high_low;
	
	@FindBy(xpath = "//li[normalize-space()='Top Rated']")
	WebElement topRated;
	
	@FindBy(xpath = "//li[normalize-space()='Newest']")
	WebElement newest;
	
	
	
	public void clickFilter() {
		wait.waitForElementToBeClickable(filterCategory);
		filterCategory.click();
	}
	
	public void filter_low_High() {
		wait.waitForElementToBeClickable(low_high);
		low_high.click();
	}
	
	public void filter_high_Low() {
		wait.waitForElementToBeClickable(high_low);
		high_low.click();
	}
	
	public void filter_topRated() {
		wait.waitForElementToBeClickable(topRated);
		topRated.click();
	}
	
	public void filter_newest() {
		wait.waitForElementToBeClickable(newest);
		newest.click();
	}
	
	public List<Double> getAllProductPrices() {

	    List<WebElement> priceElements =
	            driver.findElements(By.xpath("//div[contains(@class,'MuiCard-root')]//h6"));

	    List<Double> prices = new ArrayList<>();

	    for (WebElement ele : priceElements) {
	        String priceText = ele.getText().replace("$", "").trim();
	        prices.add(Double.parseDouble(priceText));
	    }

	    return prices;
	}
	
	

}
