package PageObject;

import org.openqa.selenium.WebDriver;

import Core.ActionDriver;
import PageElements.AdminHomePageElement;

public class AdminHomePage extends ActionDriver
{

	public AdminHomePage(WebDriver driver) throws Exception 
	{
		super(driver);
		/*if(!driver.getTitle().equals("World Sports BaseBall"))
		{
			throw new Exception("this not valid baseball page "+driver.getTitle());
		}*/
	}    
	
	public AdminHomePage Verify() throws Exception
	{
		System.out.println(gettext(AdminHomePageElement.getVerify()));
		assert gettext(AdminHomePageElement.getVerify()).equals("Admin Master"):"verify is fail";
		return new AdminHomePage(driver);   
	}
 
}
 