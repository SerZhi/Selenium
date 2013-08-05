package Step5.PagesMethods;

import Step5.Pages.*;
import Step5.Entity.*;

public class LoginPageMethods {
	
	LoginPage loginpage;
	
	public LoginPageMethods(LoginPage loginpage){
		this.loginpage = loginpage;
	}
	
	public void login(User user) {
		loginpage.login_field.sendKeys(user.getUsername());
		loginpage.password_field.sendKeys(user.getPassword());
		loginpage.login_button.click();
	}

}
