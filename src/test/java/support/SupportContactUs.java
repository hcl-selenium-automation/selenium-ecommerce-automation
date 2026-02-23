package support;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SupportContactUs {

	@Test
	public void clickOnLinkedIn() {
		SendMessage sm = new SendMessage();
		sm.setup();
		sm.clickSupport();
		sm.driver.findElement(By.xpath("//a[normalize-space()='Contact Us']")).click();
		
		
	}
}
