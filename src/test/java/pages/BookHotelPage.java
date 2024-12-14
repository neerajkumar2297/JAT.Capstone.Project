package pages;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.UtilityCls;

public class BookHotelPage extends UtilityCls {

	@FindBy(id = "first_name")
	WebElement first_name;

	@FindBy(id = "last_name")
	WebElement last_name;

	@FindBy(id = "address")
	WebElement address;

	@FindBy(id = "cc_num")
	WebElement cc_num;

	@FindBy(id = "cc_type")
	WebElement cc_type;

	@FindBy(id = "cc_exp_month")
	WebElement cc_exp_month;

	@FindBy(id = "cc_exp_year")
	WebElement cc_exp_year;

	@FindBy(id = "cc_cvv")
	WebElement cc_cvv;

	@FindBy(id = "book_now")
	WebElement book_now;

	public BookHotelPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public BookHotelPage first_name() {

		passValue(first_name, "Neeraj");
		return this;
	}

	public BookHotelPage last_name() {

		LocalDateTime currentDateTime = LocalDateTime.now();

		// Format the date and time as a string
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String dateTimeString = currentDateTime.format(formatter);

		passValue(last_name, " Kumar" + dateTimeString);
		return this;
	}

	public BookHotelPage address() {

		passValue(address, "Door No.123 22nd Cross, 4th Main Street, Mysuru-570008");
		return this;
	}

	public BookHotelPage cc_num() {

		passValue(cc_num, "1234567890123456");
		return this;
	}

	public BookHotelPage cc_type() {

		selectCls(cc_type, "VISA");

		return this;
	}

	public BookHotelPage cc_exp_month() {

		selectCls(cc_exp_month, "November");

		return this;
	}

	public BookHotelPage cc_exp_year() {

		selectCls(cc_exp_year, "2029");

		return this;
	}

	public BookHotelPage cc_cvv() {

		passValue(cc_cvv, "123");

		return this;
	}

	public BookHotelPage book_now() {

		book_now.click();

		return this;
	}

}
