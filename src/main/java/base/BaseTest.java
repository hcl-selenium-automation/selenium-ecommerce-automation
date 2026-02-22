package base;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import config.ConfigReader;
public class BaseTest {
	protected WebDriver driver;
    @BeforeSuite
    public void setup() {
    	System.setProperty("webdriver.chrome.silentOutput", "true");
    	java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(java.util.logging.Level.OFF);
        DriverFactory.initDriver();
        driver = DriverFactory.getDriver();
        DriverFactory.getDriver().get(ConfigReader.get("url"));
    }
    @AfterSuite
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}