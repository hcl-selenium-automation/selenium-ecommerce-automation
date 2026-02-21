package base;

<<<<<<< HEAD
import java.util.logging.Logger;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import config.ConfigReader;

@Listeners(reports.ExtentManager.class)
public class BaseTest {

    @BeforeSuite
    public void setup() {
        System.setProperty("webdriver.chrome.silentOutput", "true");
        Logger.getLogger("org.openqa.selenium").setLevel(java.util.logging.Level.OFF);
        DriverFactory.initDriver();
=======
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import config.ConfigReader;

public class BaseTest {
	protected WebDriver driver;

    @BeforeSuite
    public void setup() {
        DriverFactory.initDriver();
        driver = DriverFactory.getDriver();
>>>>>>> 2a746d6 (add login and registration)
        DriverFactory.getDriver().get(ConfigReader.get("url"));
    }

    @AfterSuite
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}