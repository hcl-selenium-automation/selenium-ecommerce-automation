package order_success;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifySupport {

	WebDriver driver;
    WebDriverWait wait;

    
    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Explicit wait
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://fusion-ecommerce-app.vercel.app/");
    }
    
    @Test
    public void verifySupport() {
    	driver.findElement(By.xpath("//a[@aria-label='Support']//*[name()='svg']")).click();
    	driver.quit();
    }
    
}
