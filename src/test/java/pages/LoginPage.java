package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectMethod;
import utils.UtilityCls;

public class LoginPage extends UtilityCls {
	
	@FindBy(id="username")
	WebElement email;
	
	@FindBy(id="password")
	WebElement pass;
	
	@FindBy(id="login")
	WebElement loginButton;
	
public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public LoginPage validCreds() {
		
		email.sendKeys("neerajkumar2297");
		pass.sendKeys("neerajkumar2297@");
		elementClickWait(loginButton, 1);
		loginButton.click();
		return this;
	
	}

	
	
}
