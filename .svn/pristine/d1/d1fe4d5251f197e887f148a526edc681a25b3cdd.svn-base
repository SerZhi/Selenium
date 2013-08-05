package Step5.Tests;

import Step5.Pages.*;
import Step5.PagesMethods.*;
import Step5.Entity.*;

import static java.lang.Thread.sleep;
import org.testng.annotations.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class tests {

	WebDriver driver;
	LoginPage loginpage;
	MainPage mainpage;
	LoginPageMethods loginpagemethods;
	MainPageMethods mainpagemethods;
	User user;
	Mail mail;
	
	@BeforeMethod public void beforemethod() {
		driver = new FirefoxDriver();
		loginpage = new LoginPage(driver);
		loginpagemethods = new LoginPageMethods(loginpage);
		mainpage = new MainPage(driver);
		mainpagemethods = new MainPageMethods(mainpage);
		driver.get("http://www.i.ua");
		user = new User("test-test-test","123456qwe");
		mail = new Mail("test-test-test@i.ua", "subject1", "text1");	
	}
	
	@AfterMethod public void aftermethod() {
		try{sleep(1000);} catch (InterruptedException ex){}
		driver.quit();
	}
	
	@Test
	public void login_logout(){
		loginpagemethods.login(user);
		mainpagemethods.logout();
	}
	
	@Test
	public void login_sendemail(){
		loginpagemethods.login(user);
		mainpagemethods.sendemail(mail);
	}
		
}	
	

