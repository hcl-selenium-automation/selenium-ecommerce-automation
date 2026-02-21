package utils;

<<<<<<< HEAD
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {

    WebDriver driver;
    WebDriverWait wait;

    // Constructor
    public WaitUtils(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Wait for element to be clickable
    public void waitForElementToBeClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    // Wait for element to be visible
=======
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class WaitUtils {

    private WebDriver driver;
    private WebDriverWait wait;

    public WaitUtils(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // ✅ IMPORTANT
    }

>>>>>>> 2a746d6 (add login and registration)
    public void waitForElementToBeVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

<<<<<<< HEAD
    // Wait for title
    public void waitForTitleContains(String title) {
        wait.until(ExpectedConditions.titleContains(title));
    }

    // Wait for URL
    public void waitForUrlContains(String url) {
        wait.until(ExpectedConditions.urlContains(url));
    }
}
=======
    public void waitForElementToBeClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
>>>>>>> 2a746d6 (add login and registration)
