package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.BaseClass;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	//My account
	@FindBy(xpath = "//span[normalize-space()='My Account']")
	WebElement linkMyAccount; 
	
	//my register
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement linkRegister;
	
	//my login
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement linkLogin;
	
	public void clickMyAccount() {
		
		linkMyAccount.click();
	}
	
	public void clickRegister() {
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		mywait.until(ExpectedConditions.elementToBeClickable(linkRegister)).click();
		
	}
	
	public void clickLogin() {
		linkLogin.click();
	}

		
}
