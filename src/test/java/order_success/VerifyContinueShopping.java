package order_success;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyContinueShopping {

	 WebDriver driver;
	    WebDriverWait wait;

	    
	    @Test
	    public void continueShopping() {
	        OrderSuccessTest os = new OrderSuccessTest();
	        os.setup();
	        os.login();
	        os.addToCart();
	        os.driver.findElement(By.xpath("//button[normalize-space()='Continue shopping']")).click();
	        os.teardown();
	    }
	    
	    
}
