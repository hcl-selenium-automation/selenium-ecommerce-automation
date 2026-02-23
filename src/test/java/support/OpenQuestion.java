package support;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class OpenQuestion {
	
	@Test
	public void seeQuestion() {
		SendMessage sm = new SendMessage();
		sm.setup();
		sm.clickSupport();
		sm.driver.findElement(By.xpath("//p[normalize-space()='How quickly do you ship orders?']")).click();
	}
}
