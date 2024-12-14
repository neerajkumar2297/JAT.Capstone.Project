package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class UtilityCls {

	public static WebDriver driver;
	public String sheetname;
	public WebDriverWait wait;

	public ExtentSparkReporter reporter; // decides the path where report will be generated, customizes looks of the
											// report
	public ExtentReports extent;// Generate Extent report based on path
	public ExtentTest test;// defines a test inside a report

	public void launch() {

		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	public void closing() {

		driver.quit();
	}

	public WebElement dropdownElement;

	public void selectCls(WebElement value1, String value2) {
		value1.click();

		dropdownElement = value1;
		elementClickWait(value1, 10);
		Select dropdown = new Select(dropdownElement);
		dropdown.selectByVisibleText(value2);

	}

	public void passValue(WebElement ele, String value) {

		ele.click();
		ele.sendKeys(value);
	}

	public void elementClickWait(WebElement ele, int duration) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
		wait.until(ExpectedConditions.elementToBeClickable(ele));

	}

}
