package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utils.UtilityCls;

public class GetBookingIdPage extends UtilityCls {

	public static String ODNo;
	public static String OrderId;

	@FindBy(id = "order_no")
	WebElement order_no;

	@FindBy(id = "search_hotel_id")
	WebElement search_btn;

	@FindBy(xpath = "(//input[@class='select_text'])[1]")
	WebElement BookindIdLocator;

	@FindBy(id = "order_id_text")
	WebElement searchOrderId;

	public GetBookingIdPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public GetBookingIdPage order_NUM() {

		ODNo = order_no.getAttribute("value");

		System.out.println("Booked Successfully. Order No.: " + ODNo);

		return this;
	}

	public GetBookingIdPage OrderIdSearch() {
		searchOrderId.click();

		passValue(searchOrderId, ODNo);
		search_btn.click();

		OrderId = BookindIdLocator.getAttribute("value");
		System.out.println("Order ID " + OrderId + " found successfully in booked itenary page.");

		return this;
	}

	public GetBookingIdPage AssertandConfirm() {

		Assert.assertEquals(ODNo, OrderId, "Unsuccessful");

		return this;
	}

}
