package support;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ClickWebsiteIcon {

	//a[@href='https://sonnguyenhoang.com/']
	@Test
	public void clickOnLinkedIn() {
		SendMessage sm = new SendMessage();
		sm.setup();
		sm.clickSupport();
		sm.driver.findElement(By.xpath("//a[@href='https://sonnguyenhoang.com/']")).click();
		
		
	}
}
