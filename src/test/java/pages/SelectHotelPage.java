package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectMethod;

public class SelectHotelPage extends ProjectMethod {
	

	@FindBy(id="radiobutton_0")
	WebElement radiobutton_0;
	
	@FindBy(id="continue")
	WebElement continuebtn;
	
	
	
	
	public SelectHotelPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	public SelectHotelPage hotelSelect() {
		radiobutton_0.click();
		
		continuebtn.click();
		
			
		return this;
		
	}


}
