package PageElements;

import org.openqa.selenium.By;

public class LoginElements 
{
	static String login="//*[@id='ankSignIn']";
	static String loginAs="//*[@id='ucLoginPanel_ddlLoginType']";
	static String loginId="//*[@id='ucLoginPanel_txtLogin']";
	static String password="//*[@id='ucLoginPanel_txtPwd']";
	static String signIn="//*[@id='ucLoginPanel_btnLogin']"; 
	static String forgotPassword="//*[@id='btnForgot']";
	static String verify="//*[@id='ucLoginPanel_lblError']";
	static String validationMsg="//*[@id='validationMsg1']";
	
public static By getLogin()
{
	return By.xpath(login);
}
public static By getLoginAs()
{
	return By.xpath(loginAs);
} 

public static By getLoginId()
{
	return By.xpath(loginId);
}
public static By getPassword()
{
	return By.xpath(password);
}
public static By getSignin()
{
	return By.xpath(signIn);
}
public static By getForgotPassword()
{
	return By.xpath(forgotPassword);
}
public static By getVerify()
{
	return By.xpath(verify);
}
public static By getValidationMsg()
{
	return By.xpath(validationMsg);
}

}
