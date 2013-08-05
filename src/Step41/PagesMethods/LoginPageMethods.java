package Step41.PagesMethods;

import Step41.Pages.*;

public class LoginPageMethods {
	
	LoginPage loginpage;
	
	public LoginPageMethods(LoginPage loginpage){
		this.loginpage = loginpage;
	}
	
	public void login() {
		loginpage.login_field.sendKeys("test-test-test");
		loginpage.password_field.sendKeys("123456qwe");
		loginpage.login_button.click();
	}
	
}
