package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectMethod;
import utils.UtilityCls;

public class HomePage extends UtilityCls {
	
	
	
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
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

public BookedIternaryPage methodBookedIternary() {
	
	return new BookedIternaryPage(driver);
}
	

}
