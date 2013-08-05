package Step3.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static java.lang.Thread.sleep;

public class MainPage {

	WebDriver driver;

	public MainPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void logout(){
		WebElement exit_link = driver.findElement(By.xpath("//ul[@class= 'user_menu']/li[7]/a"));
		exit_link.click();
	}
		
	public void  sendemail(){
		try{sleep(3000);} catch (InterruptedException ex){}
		
		WebElement new_email_link = driver.findElement(By.xpath("//div[@class = 'navigation_section clear']/ul/li[1]/a"));
		new_email_link.click();
		
		try{sleep(2000);} catch (InterruptedException ex){}
			
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
