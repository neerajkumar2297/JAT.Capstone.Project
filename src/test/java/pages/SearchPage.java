package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.ProjectMethod;

public class SearchPage extends ProjectMethod {
	
	@FindBy(linkText="https://adactinhotelapp.com/SearchHotel.php")
	WebElement Search_Hotel;
	

	@FindBy(id="location")
	WebElement location;
	
	@FindBy(id="hotels")
	WebElement hotels;
	
	@FindBy(id="room_type")
	WebElement room_type;
	
	@FindBy(id="room_nos")
	WebElement room_nos;
	
	@FindBy(id="datepick_in")
	WebElement datepick_in;
	
	@FindBy(id="datepick_out")
	WebElement datepick_out;
	
	@FindBy(id="adult_room")
	WebElement adult_room;
	
	@FindBy(id="child_room")
	WebElement child_room;
	
	@FindBy(id="Submit")
	WebElement Submit;
	
	
	
	
	
	public SearchPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	public SearchPage selectLocation() {
					
		selectCls(location, "Melbourne");
		
		return this;
		}
	
	public SearchPage hotels() {
		
		selectCls(hotels, "Hotel Sunshine");
			
		return this;
		}
	
	public SearchPage room_type() {
		
		selectCls(room_type, "Standard");
		return this;
		}
	
	public SearchPage room_nos() {
		
		selectCls(room_nos, "2 - Two");
		return this;
		}
	
	public SearchPage datepick_in() {
		
		datepick_in.click();
		datepick_in.clear();
		
		datepick_in.sendKeys("25/11/2024");
		
		return this;
		}
	
	public SearchPage datepick_out(){
		
		datepick_out.click();
		datepick_out.clear();
		
		datepick_out.sendKeys("26/11/2024");
		
		return this;
		}
	
	
	public SearchPage adult_room() {
		
		selectCls(adult_room, "2 - Two");
		return this;
		}

	public SearchPage child_room() {
	
	selectCls(child_room, "1 - One");
	return this;
	}
	
	public SearchPage Submit() {
		
		Submit.click();
		return this;
		}
	

	
	
	
	
	
	
	
	
	
	
}
