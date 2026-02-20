package utils;

import java.io.File;
import org.openqa.selenium.*;
import org.apache.commons.io.FileUtils;

public class ScreenShotUtils {

	public static String capture(WebDriver driver, String testName) {

		try {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			String path = "screenshots/" + testName + ".png";
			FileUtils.copyFile(src, new File(path));
			return path;

		} catch (Exception e) {
			return null;
		}
	}
}
