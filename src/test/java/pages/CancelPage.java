package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.UtilityCls;

public class CancelPage extends UtilityCls {

	@FindBy(xpath = "(//input[@type='button'])[1]")
	WebElement cancelbtn;

	@FindBy(id = "search_result_error")
	WebElement cancelmsg;

	public CancelPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public CancelPage clickCancelbtn() {

		cancelbtn.click();

		Alert alert = driver.switchTo().alert();

		// Accept the alert
		alert.accept();

		return this;
	}

	public CancelPage cancelledMsg() {

		String ExpectedMsg = "The booking has been cancelled.";

		String ActualMsg = cancelmsg.getText();

		if (ExpectedMsg.equalsIgnoreCase(ActualMsg)) {

			System.out.println("Cancelled Successfully");
		}

		return this;
	}

}
