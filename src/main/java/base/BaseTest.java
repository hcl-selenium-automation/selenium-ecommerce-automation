package base;

import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import config.ConfigReader;
import utils.LoggerUtil;

@Listeners(listeners.TestListener.class)
public class BaseTest {
	protected Logger log = LoggerUtil.getLogger(this.getClass());

	@BeforeSuite
	public void setup() {
		DriverFactory.initDriver();
		DriverFactory.getDriver().get(ConfigReader.get("url"));
	}

	@AfterSuite 
	public void tearDown() throws InterruptedException {
		DriverFactory.quitDriver();
	}
}
