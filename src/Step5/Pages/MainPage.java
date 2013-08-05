package Step5.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class MainPage {

	WebDriver driver;
	
	public MainPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(xpath = "//ul[@class= 'user_menu']/li[7]/a") @CacheLookup public WebElement exit_link;
	@FindBy(xpath = "//div[@class = 'navigation_section clear']/ul/li[1]/a") @CacheLookup public WebElement new_email_link;
	@FindBy(xpath = "//*[@id = 'to']") @CacheLookup public WebElement to_field;
	@FindBy(xpath = "//*[@name = 'subject']") @CacheLookup public WebElement subject_field;
	@FindBy(xpath = "//*[@id = 'text' and @name = 'body']") @CacheLookup public WebElement body_field;
	@FindBy(xpath = "//p[@class = 'send_container clear']/input[1]") @CacheLookup public WebElement send_button;

}
		
	
	
	

