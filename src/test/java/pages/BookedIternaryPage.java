package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectMethod;

public class BookedIternaryPage extends ProjectMethod{
	
	@FindBy(xpath="//a[@href='BookedItinerary.php']")
	WebElement BookedItinerary;
	
	
	
	
	

	
	public BookedIternaryPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	
}
