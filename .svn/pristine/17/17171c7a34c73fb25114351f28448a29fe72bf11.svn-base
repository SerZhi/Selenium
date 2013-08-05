package Step42.Tests;

import static java.lang.Thread.sleep;
import Step42.Pages.*;

import org.testng.annotations.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class tests {

	WebDriver driver;
	LoginPage loginpage;

	@BeforeMethod public void beforemethod() {
		driver = new FirefoxDriver();
		loginpage = new LoginPage(driver);
		driver.get("http://www.i.ua");
	}
	
	@AfterMethod public void aftermethod() {
		try{sleep(1000);} catch (InterruptedException ex){}
		driver.quit();
	}
	
	@Test
	public void login_logout(){
		loginpage.login()
		.logout();
	}
	
	@Test
	public void login_sendemail(){
		loginpage.login()
		.sendemail();
	}
		
}
	
		
		
		
		
		
		
	
		
	
	