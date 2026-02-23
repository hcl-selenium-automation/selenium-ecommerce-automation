package support;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SendMessage {

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
    public void clickSupport() {
    	driver.findElement(By.xpath("//a[@aria-label='Support']//*[name()='svg']")).click();
    }
    @Test(priority=1)
    public void fillForm() {
    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='name' and contains(@class,'MuiOutlinedInput-input')]"))).sendKeys("John");
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email' and @type='email' and @required='']"))).sendKeys("Johndoe7@gmail.com");
    	driver.findElement(By.xpath("//input[@name='topic' and @required='' and @type='text']")).sendKeys("Order Tracking");
    	driver.findElement(By.xpath("//textarea[@name='message' and not(@aria-hidden)]")).sendKeys("Hello this is for just checking");
    	driver.findElement(By.xpath("//button[normalize-space()='Submit request']")).click();
   
    }
}
