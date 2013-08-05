package Step4.Tests;

import org.testng.annotations.*;
import  org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import static java.lang.Thread.sleep;
import Step4.Pages.*;

public class tests {

	WebDriver driver;
	LoginPage loginpage;
//	MainPage mainpage;

	@BeforeMethod public void beforemethod() {
		driver = new FirefoxDriver();
		loginpage = new LoginPage(driver);
//		mainpage = new MainPage(driver);
		driver.get("http://demo131.dataart.com/trade/buy");
	}
	
	@AfterMethod public void aftermethod() {
		try{sleep(1000);} catch (InterruptedException ex){}
		driver.quit();
	}
	
	@Test
	public void semechka_search(){
		loginpage.search();
//		mainpage.logout();
	}
	
//	@Test
//	public void login_sendemail(){
//		loginpage.login();
//		mainpage.sendemail();
//	}
		
}
	
		
		
		
		
		
		
	
		
	
	