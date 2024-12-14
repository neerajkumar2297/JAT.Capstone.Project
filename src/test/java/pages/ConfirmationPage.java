package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.UtilityCls;

public class ConfirmationPage extends UtilityCls {

	@FindBy(id = "order_no")
	WebElement order_no;

	public ConfirmationPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public ConfirmationPage order_no() {

		String ODNo = order_no.getAttribute("value");

		System.out.println("Booked Successfully. Order No.: " + ODNo);

		return this;
	}

}
