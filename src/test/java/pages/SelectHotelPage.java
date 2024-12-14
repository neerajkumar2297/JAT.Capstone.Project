package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.UtilityCls;

public class SelectHotelPage extends UtilityCls {

	@FindBy(id = "radiobutton_0")
	WebElement radiobutton_0;

	@FindBy(id = "continue")
	WebElement continuebtn;

	public SelectHotelPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public SelectHotelPage hotelSelect() {
		radiobutton_0.click();

		continuebtn.click();

		return this;

	}

}
