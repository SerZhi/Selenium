package Step41.PagesMethods;

import static java.lang.Thread.sleep;
import Step41.Pages.*;

public class MainPageMethods {
	
	MainPage mainpage;
	
	public MainPageMethods(MainPage mainpage){
		this.mainpage = mainpage;
	}
	
	public void logout(){
		 try{sleep(5000);} catch (InterruptedException ex){}
		 mainpage.exit_link.click();
	}
		
	public void sendemail(){
			try{sleep(3000);} catch (InterruptedException ex){}

			mainpage.new_email_link.click();
			
			try{sleep(2000);} catch (InterruptedException ex){}
			
			mainpage.to_field.sendKeys("test-test-test@i.ua");
			mainpage.subject_field.sendKeys("subject1");
			mainpage.body_field.sendKeys("text1");
			mainpage.send_button.click();
	
	}

}