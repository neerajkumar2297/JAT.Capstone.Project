package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectMethod;

public class BookedIternaryPage extends ProjectMethod{
	
	@FindBy(xpath="//a[@href='BookedItinerary.php']")
	WebElement BookedItinerary;
	
	@FindBy(id="order_id_text")
	WebElement searchOrderId;
	
	@FindBy(id="search_hotel_id")
	WebElement search_btn;
	
	

	
	public BookedIternaryPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public BookedIternaryPage clickBookedIternary() {
		BookedItinerary.click();
		return this;
	}
	
	public BookedIternaryPage searchOrderId() {
		
		
		searchOrderId.click();
		
		passValue(searchOrderId, "V37GL9VE43");
		search_btn.click();
		
		
		
		return this;
	}

	
}
