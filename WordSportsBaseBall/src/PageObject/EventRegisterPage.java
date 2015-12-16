package PageObject;

import org.openqa.selenium.WebDriver;

import Core.ActionDriver;
import PageElements.EventRegisterElement;

public class EventRegisterPage extends ActionDriver
{
	public EventRegisterPage(WebDriver driver) throws Exception 
	{
		super(driver);
		/*if(!gettext(EventRegisterElement.getVerifyPage()).equals("Add your team information"))
		{
			throw new Exception("This is not event page");
		}*/
	}
	
	public EventRegisterPage ClickRegister()
	{
		Click(EventRegisterElement.getRegister());
		return this;
	}
	public EventRegisterPage Chooseteam(String team)
	{
		selectValue(EventRegisterElement.getChooseTeam(), team);
		return this;
	}
	public EventRegisterPage TypeTeamName(String Teamname)
	{
		TypeText(EventRegisterElement.getTeamName(), Teamname);
		return this;
	}
	public EventRegisterPage TypeTwitter(String twitter)
	{
		TypeText(EventRegisterElement.getTwitter(), twitter);
		return this;
	}
	public EventRegisterPage SelectSkill(String skill)
	{
		selectValue(EventRegisterElement.getSkill(), skill);
		return this;
	}
	public EventRegisterPage TypeHomeText(String text)
	{
		TypeText(EventRegisterElement.getHomeText(), text);
		return this;
	}
	public EventRegisterPage SelectAgeLevel(String Agelevel)
	{
		selectValue(EventRegisterElement.getAgelevel(), Agelevel);
		return this;
	}
	public EventRegisterPage SelectState(String state)
	{
		selectValue(EventRegisterElement.getState(), state);
		return this;
	}
	public boolean VerifyGender()
	{
       return enabled(EventRegisterElement.getVerifyPage());   
	}
	public EventRegisterPage ClickNext()
	{
		Click(EventRegisterElement.getNext());
		return this;
	}
	
}
