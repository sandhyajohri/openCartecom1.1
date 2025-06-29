package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmailAddress;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPasswd;
	
	@FindBy (xpath="//input[@value='Login']")
	WebElement btn_login;
	
	public void setEmailAddress(String email) {
		txtEmailAddress.sendKeys(email);
		
	}
	
	public void setPassword(String pwd) {
		txtPasswd.sendKeys(pwd);
	}
	
	public void click_loginBtn() {
		
		btn_login.click();
	}
	
	

}
