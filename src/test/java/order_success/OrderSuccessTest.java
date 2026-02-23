package order_success;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;

public class OrderSuccessTest {

    WebDriver driver;
    WebDriverWait wait;

    
    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Explicit wait
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test(priority=1)
    public void login() {
        driver.get("https://fusion-ecommerce-app.vercel.app/login");

        // Wait for email input visible
        WebElement email = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Email')]/following::input[1]"))
        );

        // Enter credentials
        email.sendKeys("johndoe@gmail.com");
        
        WebElement password = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//label[contains(text(),'Password')]/following::input[@type='password'][1]")
                )
        );
        password.sendKeys("johndoe");

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[normalize-space()='Login']")
                )
        ).click();
    }
    
    @Test(priority=2)
    public void addToCart() {
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='root']/main[@class='MuiBox-root css-3mujz1']/div[@class='MuiContainer-root MuiContainer-maxWidthXl css-1sb11ge']/div[@class='MuiBox-root css-nh9wik']/div[@class='MuiContainer-root MuiContainer-maxWidthXl css-1ekb41w']/div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-4 css-1tz8m30']/div[1]/div[1]/div[3]/button[1]"))).click();
        
        driver.findElement(By.xpath("//span[@class='MuiBadge-badge MuiBadge-standard MuiBadge-anchorOriginTopRight MuiBadge-anchorOriginTopRightCircular MuiBadge-overlapCircular MuiBadge-colorSecondary css-14xzrm3']")).click();
    }
    @Test(priority=3)
    public void placeOrder() {
    	//span[@class='MuiBadge-root css-1rzb3uu']//*[name()='svg']//*[name()='path' and contains(@d,'M7 18c-1.1')]
    
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Proceed to Checkout']"))).click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='name']"))).sendKeys("John Doe");
        
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("johndoe@gmail.com");
        driver.findElement(By.xpath("//input[@id='shippingAddress']")).sendKeys("32, canada street, America");
        
        driver.findElement(By.xpath("//input[@id='cardNumber']")).sendKeys("4242 4242 4242 4242");
        driver.findElement(By.xpath("//input[@id='cardName']")).sendKeys("John Doe");
        driver.findElement(By.xpath("//input[@id='expiry']")).sendKeys("022026");
        driver.findElement(By.xpath("//input[@id='cvc']")).sendKeys("564");
        driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();
        
    }
    
    @Test(priority=4)
    public void confirmOrder() {
    	WebElement placed = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[@class='MuiTypography-root MuiTypography-h4 MuiTypography-gutterBottom css-1th6ugm']")));
    	Assert.assertTrue(placed!=null);
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}