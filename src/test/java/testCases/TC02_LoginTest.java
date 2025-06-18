package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC02_LoginTest extends BaseClass {
	
	@Test(groups={"Sanity","Master"})
	public void verify_Login() {
		logger.info("**************Staring T02_LoginTest");
		try {
		HomePage hp = new HomePage(driver);
		logger.info("**************Staring home page");
		hp.clickMyAccount();
		hp.clickLogin();
		logger.info("**************clicked login link");
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmailAddress(p.getProperty("email"));
		lp.setPassword("cHIPPU2025");
		lp.click_loginBtn();
		logger.info("**************clicked login button");
		
		//Validating msg heading
		
		MyAccountPage ap = new MyAccountPage(driver);
		boolean heading = ap.isMyAccountPageExists();
		
		Assert.assertTrue(heading);//Assert.assertEquals(targetPage, true,"Login failed");
	  }
	  catch(Exception e)
	  {
		Assert.fail();
	  }
	   logger.info("****** Finished TC_002_LoginTest *****");
	   }

}
