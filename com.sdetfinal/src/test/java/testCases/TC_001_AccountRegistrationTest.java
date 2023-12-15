package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass {


@Test
void test_account_Registration()
{
	try
	{
	HomePage hp= new HomePage(driver);
	hp.clickMyAccount();
	hp.clickRegister();
	
	AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
	regpage.setFirstName(randomeString().toUpperCase());
	regpage.setLastName(randomeString().toUpperCase());
	regpage.setEmail(randomeString()+"@gmail.com");     //random email
	regpage.setPassword(randomeAlphaNumeric());			//random alphanumeric	
	regpage.setPrivacyPolicy();
	regpage.clickContinue();
	String confmsg = regpage.getConfirmationMsg();
	Assert.assertEquals(confmsg,"Your Account Has Been Created!");
	}
	catch(Exception e)
	{
		Assert.fail();
	}
}

}
