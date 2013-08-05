package Step5.PagesMethods;

import static java.lang.Thread.sleep;

import Step5.Pages.*;
import Step5.Entity.*;

public class MainPageMethods {
	
	MainPage mainpage;
	
	public MainPageMethods(MainPage mainpage){
		this.mainpage = mainpage;
	}
	
	public void logout(){
		try{sleep(5000);} catch (InterruptedException ex){}
		 mainpage.exit_link.click();
	}
		
	public void sendemail(Mail mail){
			try{sleep(5000);} catch (InterruptedException ex){}

			mainpage.new_email_link.click();
			
			try{sleep(2000);} catch (InterruptedException ex){}
				
			mainpage.to_field.sendKeys(mail.getRecipient());
			mainpage.subject_field.sendKeys(mail.getSubject());
			mainpage.body_field.sendKeys(mail.getText());
			mainpage.send_button.click();
	
	}
}