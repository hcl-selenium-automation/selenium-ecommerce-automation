package reports;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.*;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import base.DriverFactory;
import utils.ScreenshotUtil;

public class ExtentManager implements ITestListener {

    private static ExtentReports extent;
    private static ExtentSparkReporter sparkReporter;
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    // 🔥 Create report only once
    private static void createReport() {

        if (extent == null) {

        

            String reportPath = System.getProperty("user.dir")
                    + "/reports/AutomationReport_" + ".html";

            sparkReporter = new ExtentSparkReporter(reportPath);

            sparkReporter.config().setDocumentTitle("Automation Testing Report");
            sparkReporter.config().setReportName("Functional Test Execution Report");
            sparkReporter.config().setTheme(Theme.DARK);
            sparkReporter.config().setTimeStampFormat("dd-MM-yyyy HH:mm:ss");

            extent = new ExtentReports();
            extent.attachReporter(sparkReporter);

            extent.setSystemInfo("Project", "Hackathon Automation");
            extent.setSystemInfo("Environment", "QA");
            extent.setSystemInfo("OS", System.getProperty("os.name"));
            extent.setSystemInfo("Browser", "Chrome");
            extent.setSystemInfo("Framework", "Selenium + TestNG");
        }
    }

    @Override
    public void onStart(ITestContext context) {
        createReport();  // 🔥 only initializes once
    }

    @Override
    public void onTestStart(ITestResult result) {

        ExtentTest extentTest = extent.createTest(
                result.getTestClass().getName() + " - " + result.getName());

        test.set(extentTest);

    
        test.get().assignCategory(contextName(result));
        test.get().info("Test Execution Started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        test.get().pass("Test Passed Successfully");

        attachScreenshot(result, "Success Screenshot");
    }

    @Override
    public void onTestFailure(ITestResult result) {

        test.get().fail(result.getThrowable());

        attachScreenshot(result, "Failure Screenshot");
    }

    @Override
    public void onTestSkipped(ITestResult result) {

        test.get().skip("Test Skipped");

        attachScreenshot(result, "Skipped Screenshot");
    }

    private void attachScreenshot(ITestResult result, String label) {

        try {
            String path = ScreenshotUtil.captureScreenshot(
                    DriverFactory.getDriver(),
                    result.getName());

            test.get().addScreenCaptureFromPath(path, label);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onFinish(ITestContext context) {

        // 🔥 Only flush when entire master suite completes
        if (extent != null) {
            extent.flush();
        }
    }

    private String contextName(ITestResult result) {
        return result.getTestContext().getName();
    }
}