package Step4.Pages;

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
	
	 @FindBy(xpath = "//div[@class='right-panel']/form/div/input") @CacheLookup public WebElement search_form;
//	 @FindBy(xpath = "//*[@name = 'pass']") @CacheLookup public WebElement password_field;
	 @FindBy(xpath = "//div[@class='search-input-wrap']/input[@type='submit']") @CacheLookup public WebElement search_button;
	 
	public void search(){
		search_form.sendKeys("семечка");
//		 password_field.sendKeys("123456qwe");
		 search_button.click();
	}
	
}
