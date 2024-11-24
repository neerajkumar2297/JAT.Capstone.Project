package utils;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class UtilityCls {
	
	public static WebDriver driver;
	public String sheetname;
	public WebDriverWait wait;
	
	
	public ExtentSparkReporter reporter; //decides the path where report will be generated, customizes looks of the report
	public ExtentReports extent;//Generate Extent report  based on path 
	public ExtentTest test;// defines a test inside a report
	
	
	
	
	
	public void launch() {
		
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	public void closing() {
		
		driver.quit();
	}
	/*
	public static String[][] readExcel(String sheetname) throws IOException {
		

		XSSFWorkbook book = new XSSFWorkbook("D:\\NewWorkSpace\\DemoWebShopProject\\src\\test\\resources\\DemoWebShopDB.xlsx");
		
		// Get to the sheet
		
		XSSFSheet sheet = book.getSheet(sheetname);
		
		// get the no.of rows
		
		int rowCount = sheet.getLastRowNum();
		
		System.out.println("Row count: "+rowCount);
		
		// get the no.of columns
		
		int columnCount = sheet.getRow(0).getLastCellNum();
		
		System.out.println("Column count: "+columnCount);
		
		// create 2D array
		
		String[][] data = new String[rowCount][columnCount];
		
		for(int i =1 ; i <= rowCount; i++) {
			
			XSSFRow row = sheet.getRow(i);
			
			// get into the columns
			
			for(int j =0 ; j<columnCount; j++) {
				
				XSSFCell cell = row.getCell(j);
				
				// to store in array
				data[i-1][j] = cell.getStringCellValue();
				
			}
			
			
		}
	
		
		book.close();
		
		return data;
	}
	*/
	
public WebElement dropdownElement;
	
	public void selectCls(WebElement value1, String value2) {
		value1.click();
		
		dropdownElement = value1;
		elementClickWait(value1, 10);
		Select dropdown = new Select(dropdownElement);
		dropdown.selectByVisibleText(value2);
		
		
	}
	
	public void passValue(WebElement ele , String value) {
		
		ele.click();
		ele.sendKeys(value);
	}
	
	public void elementClickWait(WebElement ele, int duration) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
	}

}
