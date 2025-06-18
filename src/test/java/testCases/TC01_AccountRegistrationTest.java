package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;


public class TC01_AccountRegistrationTest extends BaseClass{
	
   @Test(groups={"Regression","Master"})
	public void verify_AccountRegistration() {
		
		try {
		//calling home page
		logger.info("*****Starting TC01_AccountRegistrationTest ");
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		logger.info("*****clicked on my account link ");
		hp.clickRegister();
		logger.info("*****clicked on my register link ");
		//Account Registration
		
		AccountRegistrationPage ar = new AccountRegistrationPage(driver);
		ar.setFirstName(randomString());
		ar.setLasttName(randomString()+"112121");
		ar.setEmail(randomString()+"@gmail.com");
		ar.setTelephone(randomNumber());
		String password = randomAlphanumeric();
		ar.setPassword(password);
		ar.setConfirmPassword(password);
		ar.setPrivacyPolicy();
		ar.clickContinue();
		
		logger.info("*****provided customer details ");
		
		String confmsg = ar.getConfirmationMsg();
		Assert.assertEquals(confmsg, "Your Account Has Been Created!", "Confirmation message mismatch");
		}
		catch(Exception e) {
			logger.error("test failed");
			logger.debug("Debug logs");
			Assert.fail("Test failed: " + e.getMessage());
		}
		finally {
			logger.info("***** Finished TC01_AccountRegistrationTest *****");
			
		}
		
	}
}
