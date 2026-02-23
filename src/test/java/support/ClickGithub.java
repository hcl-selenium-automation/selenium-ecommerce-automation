package support;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ClickGithub {

	@Test
	public void clickOnGithub() {
		SendMessage sm = new SendMessage();
		sm.setup();
		sm.clickSupport();
		sm.driver.findElement(By.xpath("//a[@aria-label='GitHub']//*[name()='svg']")).click();
		
	}
}
