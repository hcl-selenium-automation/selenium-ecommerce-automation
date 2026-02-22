package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
<<<<<<< HEAD
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	static WaitUtils wait;
	public static void initDriver() {
		WebDriver webDriver = new ChromeDriver();
		webDriver.manage().window().maximize();
		driver.set(webDriver);
		wait = new WaitUtils(webDriver);
	}
=======
>>>>>>> 2a746d6 (add login and registration)

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void initDriver() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        driver.set(webDriver);
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}