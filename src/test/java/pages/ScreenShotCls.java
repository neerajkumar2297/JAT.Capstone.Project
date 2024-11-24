package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utils.UtilityCls;

public class ScreenShotCls implements ITestListener {

	private WebDriver driver;
	
	
	public ScreenShotCls (WebDriver driver) {
		this.driver=driver;
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		
		TakesScreenshot ss = (TakesScreenshot)driver;
		
		File src = ss.getScreenshotAs(OutputType.FILE);
		
		File dst=new File(System.getProperty("user.dir") + "\\Images\\img.jpeg");
		try {
			FileUtils.copyFile(src, dst);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
