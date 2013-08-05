package Step3.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static java.lang.Thread.sleep;


public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void login(){
		WebElement login_field = driver.findElement(By.xpath("//*[@name = 'login']"));
		WebElement password_field = driver.findElement(By.xpath("//*[@name = 'pass']"));
		WebElement login_button = driver.findElement(By.xpath("//p/input[@type= 'submit']"));
		 
		login_field.sendKeys("test-test-test");
		password_field.sendKeys("123456qwe");
		login_button.click();
		
		try{sleep(5000);} catch (InterruptedException ex){}
	}
	
}
