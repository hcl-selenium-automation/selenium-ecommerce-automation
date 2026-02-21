package shoppage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class Category extends BasePage {

	public Category(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//span[@class='MuiChip-label MuiChip-labelMedium css-9iedg7'][normalize-space()='Computers']")
	WebElement computers;
	
	@FindBy(xpath = "//span[@class='MuiChip-label MuiChip-labelMedium css-9iedg7'][normalize-space()='Electronics']")
	WebElement electronics;
	
	public void clickComputers() {
		wait.waitForElementToBeClickable(computers);
		computers.click();
	}
	
	public void clickElectronics() {
		wait.waitForElementToBeClickable(electronics);
		electronics.click();
	}
	
	
	
}
