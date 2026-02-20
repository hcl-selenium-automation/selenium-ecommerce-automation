package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import base.DriverFactory;
import reports.ExtentManager;
import utils.ScreenShotUtils;

public class TestListener implements ITestListener {

	private static ExtentReports extent = ExtentManager.getExtentReport();
	private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

	@Override
	public void onTestStart(ITestResult result) {
		test.set(extent.createTest(result.getMethod().getMethodName()));
	}

	@Override
	public void onTestFailure(ITestResult result) {

		String path = ScreenShotUtils.capture(DriverFactory.getDriver(), result.getMethod().getMethodName());

		test.get().fail(result.getThrowable());

		if (path != null) {
			test.get().addScreenCaptureFromPath(path);
		}
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.get().pass("Test Passed");
	}

	@Override
	public void onFinish(org.testng.ITestContext context) {
		extent.flush();
	}
}
