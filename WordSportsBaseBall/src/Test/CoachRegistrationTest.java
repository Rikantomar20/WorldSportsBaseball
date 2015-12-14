package Test;

import org.testng.annotations.Test;

import Core.OpenandCloseBrowser;
import PageObject.CoachRegistrationPage;
import Utility.ExcelUtil;

public class CoachRegistrationTest extends OpenandCloseBrowser
{
	@Test 
	public void CoachRegistration() throws Exception
	{
		ExcelUtil.setExcelFile();
		
		CoachRegistrationPage crp=new CoachRegistrationPage(driver);
		
		crp.SignUp().SignUpAs(ExcelUtil.getCellData(2, 5)).ClckSignUp().VerifyCoachsignUp().TypeFirstName(ExcelUtil.getCellData(3, 5)).TypeLastName(ExcelUtil.getCellData(4, 5));
		crp.TypeEmail(ExcelUtil.getCellData(5, 5)).SelectGender(ExcelUtil.getCellData(7, 5)).TypeTeamName(ExcelUtil.getCellData(8, 5));
		crp.TypeAddress1(ExcelUtil.getCellData(9, 5)).SelectState(ExcelUtil.getCellData(10, 5));
		crp.TypeCity(ExcelUtil.getCellData(11, 5)).Submit();
	}   //ClckTeamAge().SelectTeamAge("U17")

}
