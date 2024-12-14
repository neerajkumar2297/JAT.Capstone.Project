package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.UtilityCls;

public class LogoutButton extends UtilityCls {

	@FindBy(xpath = "//a[normalize-space()='Logout']")
	WebElement LogoutBtn;

	public LogoutButton(WebDriver driver) {

		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public LogoutButton logout() {

		LogoutBtn.click();

		return this;
	}

}
