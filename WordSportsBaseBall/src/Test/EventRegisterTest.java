package Test;

import org.testng.annotations.Test;

import Core.OpenandCloseBrowser;
import PageObject.EventRegisterPage;

public class EventRegisterTest extends OpenandCloseBrowser
{
	@Test
	public void EventRegister() throws Exception
	{
        LoginTest login=new LoginTest();
		
		login.Testlogin();
		
		EventRegisterPage event=new EventRegisterPage(driver);
		
		event.ClickRegister().Chooseteam("<New Team>").TypeTeamName("R Team").TypeTwitter("https://twitter.com/mlb").SelectSkill("Major");
		event.TypeHomeText("My home text").SelectAgeLevel("U16").SelectState("Arizona");
		
		if(event.VerifyGender()==true);
		{
			System.out.println("Verify is passed");
		}
		
    }

}
