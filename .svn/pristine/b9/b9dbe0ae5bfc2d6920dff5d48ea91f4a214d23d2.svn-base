package Step3.Tests;

import static java.lang.Thread.sleep;
import org.testng.annotations.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

import Step3.Pages.*;

public class tests {

	WebDriver driver;
	LoginPage loginpage;
	MainPage mainpage;

	@BeforeMethod public void beforemethod() {
		driver = new FirefoxDriver();
		loginpage = new LoginPage(driver);
		mainpage = new MainPage(driver);
		driver.get("http://www.i.ua");
	}
	
	@AfterMethod public void aftermethod() {
		try{sleep(1000);} catch (InterruptedException ex){}
		driver.quit();
	}
	
	@Test
	public void login_logout(){
		loginpage.login();
		mainpage.logout();
	}
	
	@Test
	public void login_sendemail(){
		loginpage.login();
		mainpage.sendemail();
	}
		
}
	
		
		
		
		
		
		
	
		
	
	