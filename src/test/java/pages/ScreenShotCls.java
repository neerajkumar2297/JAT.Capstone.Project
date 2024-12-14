package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.MediaEntityBuilder;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class ScreenShotCls implements ITestListener {

	private static WebDriver driver;
	private static ExtentReports extent;
	private static ExtentTest test;

	public static void setVariables(WebDriver driver, ExtentReports extent, ExtentTest test) {
		ScreenShotCls.driver = driver;
		ScreenShotCls.extent = extent;
		ScreenShotCls.test = test;
	}

	@Override
	public void onTestFailure(ITestResult result) {

		TakesScreenshot ss = (TakesScreenshot) driver;

		File src = ss.getScreenshotAs(OutputType.FILE);

		String dst = System.getProperty("user.dir") + "\\Images\\" + result.getMethod().getMethodName();
		try {
			FileUtils.copyFile(src, new File(dst));

			test.fail("TestFailed", MediaEntityBuilder.createScreenCaptureFromPath(dst).build());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
