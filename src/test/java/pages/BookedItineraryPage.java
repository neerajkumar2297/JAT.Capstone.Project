package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utils.UtilityCls;

public class BookedItineraryPage extends UtilityCls {

	@FindBy(xpath = "//a[@href='BookedItinerary.php']")
	WebElement BookedItinerary;

	@FindBy(id = "order_id_text")
	WebElement searchOrderId;

	@FindBy(id = "search_hotel_id")
	WebElement search_btn;

	@FindBy(xpath = "(//input[@class='select_text'])[1]")
	WebElement orderidd;

	public BookedItineraryPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public BookedItineraryPage clickBookedIternary() {
		BookedItinerary.click();
		return this;
	}

	public BookedItineraryPage searchOrderId() {

		searchOrderId.click();

		passValue(searchOrderId, "V37GL9VE43");
		search_btn.click();

		return this;
	}

	public BookedItineraryPage printOrderId() {
		String val = orderidd.getAttribute("value");
		System.out.println("The order ID is:" + val);

		Assert.assertEquals("V37GL9VE43", val, "Unsuccessful");

		return this;
	}

}
