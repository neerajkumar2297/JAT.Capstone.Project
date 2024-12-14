package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utils.UtilityCls;

public class HomePage extends UtilityCls {

	public HomePage(WebDriver driver) {

		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public LoginPage clickLoginButton() {

		return new LoginPage(driver);
	}

	public SearchPage methodSearch() {

		return new SearchPage(driver);
	}

	public SelectHotelPage methodSelectHotel() {

		return new SelectHotelPage(driver);
	}

	public BookHotelPage methodBookHotel() {

		return new BookHotelPage(driver);
	}

	public ConfirmationPage methodConfirmation() {

		return new ConfirmationPage(driver);
	}

	public BookedItineraryPage methodBookedIternary() {

		return new BookedItineraryPage(driver);
	}

	public LogoutButton methodLogout() {

		return new LogoutButton(driver);
	}

	public GetBookingIdPage methodBookAndConfirm() {

		return new GetBookingIdPage(driver);
	}

	public CancelPage methodCancelBooking() {

		return new CancelPage(driver);
	}

}
