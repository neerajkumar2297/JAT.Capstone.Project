package base;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import utils.UtilityCls;

public class ProjectMethod extends UtilityCls {

	public ExtentReports extent;
	public ExtentTest test;

	@BeforeSuite
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
	public void launchBrowser() {

		launch();

	}

	/*
	 * @DataProvider(name="ReadData") public String[][] readData() throws
	 * IOException {
	 * 
	 * String[][] data = readExcel(sheetname); return data; }
	 */

	/*
	 * @AfterMethod public void closeBrowser() {
	 * 
	 * closing(); }
	 * 
	 * 
	 * @AfterClass public void closeBrowser() {
	 * 
	 * closing(); }
	 */

	@AfterClass
	public void reportClose() {
		extent.flush();
	}

}
