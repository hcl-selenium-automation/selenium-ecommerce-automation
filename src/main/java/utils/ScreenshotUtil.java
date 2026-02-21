package utils;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {

    public static String captureScreenshot(WebDriver driver, String testName) {

        if (driver == null) {
            System.out.println("Driver is null. Screenshot not captured.");
            return "";
        }

        

        String fileName = testName + "_"+ ".png";

        String folderPath = System.getProperty("user.dir") + "/screenshots/";

      
        File folder = new File(folderPath);
        if (!folder.exists()) {
            folder.mkdirs();
        }

        String filePath = folderPath + fileName;

        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);
            File dest = new File(filePath);

            FileUtils.copyFile(src, dest);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return filePath;  // for Extent Report attachment
    }
}