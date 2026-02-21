package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utils.WaitUtils;

public class BasePage {
<<<<<<< HEAD
	public static WebDriver driver;
	  protected WaitUtils wait;
=======
	protected WebDriver driver;
	public WaitUtils wait;
>>>>>>> 2a746d6 (add login and registration)

	public BasePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WaitUtils(driver);  
		PageFactory.initElements(driver, this);
		wait = new WaitUtils(driver);
	}
}