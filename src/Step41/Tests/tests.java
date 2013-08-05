package Step41.Tests;


import static java.lang.Thread.sleep;
import Step41.Pages.*;
import Step41.PagesMethods.*;

import org.testng.annotations.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class tests {

	WebDriver driver;
	LoginPage loginpage;
	MainPage mainpage;
	LoginPageMethods loginpagemethods;
	MainPageMethods mainpagemethods;

	@BeforeMethod public void beforemethod() {
		driver = new FirefoxDriver();
		loginpage = new LoginPage(driver);
		loginpagemethods = new LoginPageMethods(loginpage);
		mainpage = new MainPage(driver);
		mainpagemethods = new MainPageMethods(mainpage);
		driver.get("http://www.i.ua");
	}
	
	@AfterMethod public void aftermethod() {
		try{sleep(1000);} catch (InterruptedException ex){}
		driver.quit();
	}
	
	@Test
	public void login_logout(){
		loginpagemethods.login();
		mainpagemethods.logout();
	}
	
	@Test
	public void login_sendemail(){
		loginpagemethods.login();
		mainpagemethods.sendemail();
	}
	
}
	
		
		
		
		
		
		
	
		
	
	