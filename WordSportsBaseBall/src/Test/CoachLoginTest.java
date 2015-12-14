package Test;

import java.util.StringTokenizer;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Core.OpenandCloseBrowser;
import PageElements.LoginElements;
import PageObject.CoachHomePage;
import PageObject.LoginPage;
import Utility.ExcelUtil;

public class CoachLoginTest extends OpenandCloseBrowser
{
	
	@Test(priority=0)
	public void CoachLogin() throws Exception
	{
		ExcelUtil.setExcelFile();
		
		String loginas=ExcelUtil.getCellData(3,1);
		String loginid=ExcelUtil.getCellData(3, 2);
		String pass=ExcelUtil.getCellData(3, 3);
		
		StringTokenizer st=new StringTokenizer(loginid, ",");
		StringTokenizer st1=new StringTokenizer(pass, ",");
		
		LoginPage login=new LoginPage(driver);
		CoachHomePage ch=new CoachHomePage(driver);
	
		login.ClickSignIn().LoginClick().Validationmsg();
		
		while(st.hasMoreTokens()) 
		{
			while(st1.hasMoreTokens())
			{
		    login.SelectLoginAs(loginas).ClearUsername().TypeUsername(st.nextToken()).ClearPassword().TypePassword(st1.nextToken()).LoginClick();
		    
		   /* WebDriverWait wait=new WebDriverWait(driver, 10);
		    wait.until(ExpectedConditions.presenceOfElementLocated(LoginElements.getVerify())); 
		    login.VerifyMsg();*/
			}
		}
		
		ch.VerifyCoach();
	}
	
	@Test(priority=1)
	public void CreatTeam() throws Exception
	{
		ExcelUtil.setExcelFile();
		
		CoachHomePage chp=new CoachHomePage(driver);
		
		chp.ClckTeam().ClckAddTeam().TypeTeamName(ExcelUtil.getCellData(3, 4)).TypeTwitter(ExcelUtil.getCellData(4, 4)).SelectSkil(ExcelUtil.getCellData(5, 4)).TypeHomeText(ExcelUtil.getCellData(6, 4));
		chp.SelectAgeLevel(ExcelUtil.getCellData(7, 4)).SelectState(ExcelUtil.getCellData(8, 4)).SelectGender(ExcelUtil.getCellData(9, 4));
	}
}
