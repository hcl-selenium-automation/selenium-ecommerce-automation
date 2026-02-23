package support;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SupportShipping {

	@Test
	public void clickOnLinkedIn() {
		SendMessage sm = new SendMessage();
		sm.setup();
		sm.clickSupport();
		sm.driver.findElement(By.xpath("//a[@class='MuiTypography-root MuiTypography-inherit MuiLink-root MuiLink-underlineNone css-e2zpgx'][normalize-space()='Shipping & Returns']")).click();
		
		
	}
}
