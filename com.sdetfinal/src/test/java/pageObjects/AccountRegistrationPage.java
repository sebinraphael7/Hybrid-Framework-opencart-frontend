package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage
{
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtFirstname;
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txtLastname;
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmail;
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPassword;
	@FindBy(xpath = "//label[text()='Yes']")
	WebElement newsLetter;
	@FindBy(xpath="//input[@name='agree']")
	WebElement chkdPolicy;
	@FindBy(xpath="//button[text()='Continue']")
	WebElement btnContinue;
	@FindBy(xpath="//h1[text()=\"Your Account Has Been Created!\"]")
	WebElement msgConfirmation;
	
	public void setFirstName(String fname)
	{
		txtFirstname.sendKeys(fname);
	}
	public void setLastName(String lname)
	{
		txtLastname.sendKeys(lname);
	}
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	public void setPrivacyPolicy()
	{
		chkdPolicy.click();
	}
	public void clickContinue()
	{
		btnContinue.click();
	}
	public void setnewsLetter()
	{
		newsLetter.click();
	}
	public String getConfirmationMsg()
	{
		try 
		{
			return(msgConfirmation.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
	}
}
