package Step2;

import org.testng.annotations.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static java.lang.Thread.sleep;


public class tests {

	WebDriver driver;

	@BeforeMethod public void beforemethod() {
		driver = new FirefoxDriver();
		driver.get("http://www.i.ua");
	}
	
	@AfterMethod public void aftermethod() {
		try{sleep(1000);} catch (InterruptedException ex){}
		driver.quit();
	}
	
	@Test
	public void login_logout(){
		login();
		logout();
	}
	
	@Test
	public void login_sendemail(){
		login();
		sendemail();
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
	
	public void logout(){
		WebElement exit_link = driver.findElement(By.xpath("//ul[@class= 'user_menu']/li[7]/a"));
		exit_link.click();
	}	
	
	public void sendemail(){
		WebElement new_email_link = driver.findElement(By.xpath("//div[@class = 'navigation_section clear']/ul/li[1]/a"));
		new_email_link.click();
		
		try{sleep(5000);} catch (InterruptedException ex){}
		
		WebElement to_field = driver.findElement(By.xpath("//*[@id = 'to']"));
		WebElement subject_field = driver.findElement(By.xpath("//*[@name = 'subject']"));
		WebElement body_field = driver.findElement(By.xpath("//*[@id = 'text' and @name = 'body']"));
		WebElement send_button = driver.findElement(By.xpath("//p[@class = 'send_container clear']/input[1]"));
			
		to_field.sendKeys("test-test-test@i.ua");
		subject_field.sendKeys("subject1");
		body_field.sendKeys("text1");
		send_button.click();
	}
		
}
	
		
		
		
		
		
		
	
		
	
	