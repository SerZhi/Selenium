package Step5.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	 @FindBy(xpath = "//*[@name = 'login']") @CacheLookup public WebElement login_field;
	 @FindBy(xpath = "//*[@name = 'pass']") @CacheLookup public WebElement password_field;
	 @FindBy(xpath = "//p/input[@type= 'submit']") @CacheLookup public WebElement login_button;
	
}
