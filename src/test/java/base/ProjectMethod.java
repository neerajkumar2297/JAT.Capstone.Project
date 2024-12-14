package base;

import java.lang.reflect.Method;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import org.testng.ITestContext;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import pages.ScreenShotCls;
import utils.UtilityCls;

@Listeners(ScreenShotCls.class)

public class ProjectMethod extends UtilityCls {

	public static ExtentReports extent;
	public static ExtentTest test;

	@BeforeTest
	public void report() {
		String path = System.getProperty("user.dir") + "\\reports\\index.html";
		reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("HotelTestResults");
		reporter.config().setDocumentTitle("Login Test Results");

		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Neeraj");
	}

	@BeforeMethod

	public void launchBrowser(Method method) {

		test = extent.createTest(method.getName());
		launch();

		ScreenShotCls.setVariables(driver, extent, test);

	}

	protected String testClassName;

	@BeforeClass
	public void setupTestClassName(ITestContext context) {
		testClassName = this.getClass().getName();

		System.out.println("----------------------------------------------------------");

		System.out.println("Executing Test Class: " + testClassName);

		System.out.println("----------------------------------------------------------");

		testClassName = null;

	}

	@AfterClass

	public void closeBrowser() {

		closing();
	}

	@AfterTest
	public void reportClose() {
		extent.flush();
	}

}
