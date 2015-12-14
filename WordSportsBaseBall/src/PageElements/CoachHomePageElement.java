package PageElements;

import org.openqa.selenium.By;

public class CoachHomePageElement
{
	static String verifyUser="//*[@id='liLogin']/button";
	static String team="//*[@id='teamc']";
	static String addTeam="//*[@id='ContentPlaceHolder1_UcteamControl_btnAdd']";
	static String teamName="//*[@id='ContentPlaceHolder1_txtName']";
	static String twitter="//*[@id='ContentPlaceHolder1_txtTwitter']";
	static String skill="//*[@id='ContentPlaceHolder1_ddlSkillLevel']";
	static String homeText="//*[@id='ContentPlaceHolder1_txtHomeText']";
	static String ageLevel="//*[@id='ContentPlaceHolder1_ddlAgeLevel']";
	static String state="//*[@id='ContentPlaceHolder1_DdlState']";
	static String gender="//*[@id='ContentPlaceHolder1_DdlGender']";
	static String next="//*[@id='ContentPlaceHolder1_btnsubmit']";
	
	public static By getVerifyUser()
	{
		return By.xpath(verifyUser);
	}
	
	public static By getClkTeam()
	{
		return By.xpath(team);
	}
	public static By getAddTeam()
	{
		return By.xpath(addTeam);
	}
	public static By getTeamName()
	{
		return By.xpath(teamName);
	}
	public static By getTwitter()
	{
		return By.xpath(twitter);
	}
	public static By getSkill()
	{
		return By.xpath(skill);
	}
	public static By getHomeText()
	{
		return By.xpath(homeText);
	}
	public static By getAgeLevel()
	{
		return By.xpath(ageLevel);
	}
	public static By getState()
	{
		return By.xpath(state);
	}
	public static By getGender()
	{
		return By.xpath(gender);
	}
	public static By getNext()
	{
		return By.xpath(next);
	}

}
