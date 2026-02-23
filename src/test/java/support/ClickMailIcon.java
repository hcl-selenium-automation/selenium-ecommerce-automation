package support;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ClickMailIcon {
	//a[@href='mailto:hoangson091104@gmail.com']
	@Test
	public void clickOnLinkedIn() {
		SendMessage sm = new SendMessage();
		sm.setup();
		sm.clickSupport();
		sm.driver.findElement(By.xpath("//a[@href='mailto:hoangson091104@gmail.com']")).click();
		
		
	}
}
