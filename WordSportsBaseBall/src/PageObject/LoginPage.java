package PageObject;

import org.openqa.selenium.WebDriver;

import Core.ActionDriver;
import PageElements.LoginElements;

public class LoginPage extends ActionDriver
{
	
	public LoginPage(WebDriver driver) throws Exception 
	{
		super(driver);
		
	/*	if(!driver.getTitle().equals(" 	World Sports Baseball "))
   	 {
   		 throw new Exception("This is not Baseball Home page"+driver.getTitle());
   	 }*/
   }  

	public LoginPage ClickSignIn() throws Exception
	{
		Click(LoginElements.getLogin());   
		return new LoginPage(driver);
	}

	public LoginPage SelectLoginAs(String value) throws Exception
	{
		selectValue(LoginElements.getLoginAs(), value);
		return new LoginPage(driver);
	}
	
	public LoginPage ClearUsername() throws Exception
	{
		Clear(LoginElements.getLoginId());
		return new LoginPage(driver);
	}
	public LoginPage TypeUsername(String Loginid) throws Exception
	{
		TypeText(LoginElements.getLoginId(), Loginid);
		return new LoginPage(driver);
	}
	
	public LoginPage ClearPassword() throws Exception
	{
		Clear(LoginElements.getPassword());
		return new LoginPage(driver);
	}
	public LoginPage TypePassword(String password) throws Exception
	{
		TypeText(LoginElements.getPassword(), password);
		return new LoginPage(driver);
	}
	
	public LoginPage LoginClick() throws Exception
	{
		Click(LoginElements.getSignin());
		return new LoginPage(driver); 
	}
	public LoginPage Validationmsg()
	{
		assert gettext(LoginElements.getValidationMsg()).equals("Please provide value for highlighted fields"):"Validation fails";
		return this;
	}
	public LoginPage VerifyMsg() throws Exception
	{
		assert gettext(LoginElements.getVerify()).equals("Invalid Credentials"):"verify is fail";
		return new LoginPage(driver);
	}
}
