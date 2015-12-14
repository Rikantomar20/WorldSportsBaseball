package PageObject;

import org.openqa.selenium.WebDriver;

import Core.ActionDriver;
import PageElements.CoachHomePageElement;

public class CoachHomePage extends ActionDriver
{

	public CoachHomePage(WebDriver driver) 
	{
		super(driver);
	}
	
	public CoachHomePage VerifyCoach()
	{
		assert gettext(CoachHomePageElement.getVerifyUser()).equals("Mark Kotsay"):"coach verify is fail";
		return this;
	}
	
	public CoachHomePage ClckTeam()
	{
		Click(CoachHomePageElement.getClkTeam());
		return this; 
	}
	
	public CoachHomePage ClckAddTeam()
	{
		Click(CoachHomePageElement.getAddTeam());
		return this;
	}
	public CoachHomePage TypeTeamName(String teamname)
	{
		TypeText(CoachHomePageElement.getTeamName(), teamname);
		return this;
	}
	public CoachHomePage TypeTwitter(String twitter)
	{
		TypeText(CoachHomePageElement.getTwitter(), twitter);
		return this;
	}
	public CoachHomePage SelectSkil(String skill)
	{
		selectValue(CoachHomePageElement.getSkill(), skill);
		return this;
	}
	public CoachHomePage TypeHomeText(String hometext)
	{
		TypeText(CoachHomePageElement.getHomeText(), hometext);
		return this;
	}
	public CoachHomePage SelectAgeLevel(String agelevel)
	{
		selectValue(CoachHomePageElement.getAgeLevel(), agelevel);
		return this;
	}
	public CoachHomePage SelectState(String state)
	{
		selectValue(CoachHomePageElement.getState(), state);
		return this;
	}
	public CoachHomePage SelectGender(String gender)
	{
		selectValue(CoachHomePageElement.getGender(), gender);
		return this;
	}
	public CoachHomePage ClckNext()
	{
		Click(CoachHomePageElement.getNext());
		return this;
	}
	

}
