package PageElements;

import org.openqa.selenium.By;

public class EventRegisterElement 
{
	static String verifypage="//h2[contains(text(),'Add your team information')]";
	static String register="Register";   // by linktext
	static String chooseTeam="//*[@id='ContentPlaceHolder1_wizRegTeams_ddlCoachTeam']";
	static String teamName="//*[@id='ContentPlaceHolder1_wizRegTeams_txtName']";
	static String twitter="//*[@id='ContentPlaceHolder1_wizRegTeams_txtTwitter']";
	static String skill="//*[@id='ContentPlaceHolder1_wizRegTeams_ddlSkillLevel']";
	static String hometext="//*[@id='ContentPlaceHolder1_wizRegTeams_txtHomeText']";
	static String agelevel="//*[@id='ContentPlaceHolder1_wizRegTeams_ddlAgeLevel']";
	static String updateage="click here";
	static String state="//*[@id='ContentPlaceHolder1_wizRegTeams_DdlState']";
	static String gender="//*[@id='ContentPlaceHolder1_wizRegTeams_DdlGender']";
	static String next="//*[@id='ContentPlaceHolder1_wizRegTeams_StartNavigationTemplateContainerID_StartNextButton']";
	
	public static By getVerifyPage()
	{
		return By.xpath(verifypage);
	}
	public static By getRegister()
	{
		return By.linkText(register);
	}
	public static By getChooseTeam()
	{
		return By.xpath(chooseTeam);
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
		return By.xpath(hometext);
	}
	public static By getAgelevel()
	{
		return By.xpath(agelevel);
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
