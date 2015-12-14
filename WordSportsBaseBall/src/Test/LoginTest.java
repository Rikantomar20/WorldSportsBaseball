package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Core.OpenandCloseBrowser;
import PageElements.AdminHomePageElement;
import PageObject.AddEventPage;
import PageObject.AdminHomePage;
import PageObject.LoginPage;
import Utility.ExcelUtil;

public class LoginTest extends OpenandCloseBrowser
{
	@Test(priority=0)
	public void Testlogin() throws Exception
	{
		ExcelUtil.setExcelFile();
		
		String loginAs=ExcelUtil.getCellData(2, 1);
		String username=ExcelUtil.getCellData(2, 2);
		String password=ExcelUtil.getData(2, 3); 
		
		System.out.println(loginAs); 
		System.out.println(username);
		System.out.println(password);
		
		LoginPage login=new LoginPage(driver);
		AdminHomePage ap=new AdminHomePage(driver);
		
		login.ClickSignIn().SelectLoginAs(loginAs).ClearUsername().TypeUsername(username).ClearPassword().TypePassword(password).LoginClick();
		
		
		ap.Verify();
		
	}
	
	@Test(priority=1)
	public void TestAddEvent() throws InterruptedException
	{
		AddEventPage event=new AddEventPage(driver);
		
		event.AddEvent().Region("National Qualifier").TournamentType("Open").EventCode("MIG101").EventName("MyTestEvent").EventType("Tournament");
		event.Gender("Female").TeamAge().SelectTeamAge("U18").Entry("Paid").ClkStartdate();
		//driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_wizRegTeams_CalendarRegStrtDate_popupDiv']")).click();
		event.StartDate("6").ClkEnddate().EndDate("10");
	}

}
