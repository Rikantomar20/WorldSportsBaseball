package PageElements;

import org.openqa.selenium.By;

public class AddEventElement 
{
	static String addEvent ="//*[@id='ContentPlaceHolder1_ucEvent_btnAdd']";
	static String region="//*[@id='ContentPlaceHolder1_wizRegTeams_ddlRegion']";
	static String tournamenttype="//*[@id='ContentPlaceHolder1_wizRegTeams_ddlTournamentType']";
	static String eventcode="//*[@id='ContentPlaceHolder1_wizRegTeams_txtEventCode']";
	static String eventname="//*[@id='ContentPlaceHolder1_wizRegTeams_txtName']";
	static String eventtype="//*[@id='ContentPlaceHolder1_wizRegTeams_ddlEventType']";
	static String gender="//*[@id='ContentPlaceHolder1_wizRegTeams_ddlGender']";
	static String teamage="//*[@id='Button1']";
	static String selectTeamage="//*[@id='ContentPlaceHolder1_wizRegTeams_CheckTeamAge_7']";   
	static String entry="label";   //by tag name
	static String cost="//*[@id='ContentPlaceHolder1_wizRegTeams_gvDetails_txtEventCost_0']";
	static String ClkStartdate="//*[@id='ContentPlaceHolder1_wizRegTeams_txtRegStrtDate']";
	static String Startdate="tr";
	static String ClkEnddate="//*[@id='ContentPlaceHolder1_wizRegTeams_txtRegEndDate']";
	static String Enddate="td";

	
	public static By getAddEvent()
	{
		return By.xpath(addEvent);
	}
	public static By getRegion()
	{
		return By.xpath(region);
	}
	public static By getTournamenttype()
	{
		return By.xpath(tournamenttype);
	}
	public static By getEventCode()
	{
		return By.xpath(eventcode);
	}
	public static By getEventName()
	{
		return By.xpath(eventname);
	}
	public static By getEventType()
	{
		return By.xpath(eventtype);
	}
	public static By getGender()
	{
		return By.xpath(gender);
	}
	public static By getTeamAge()
	{
		return By.xpath(teamage);
	}
	public static By getSelectTeamAge()
	{
		return By.xpath(selectTeamage);
	}
	public static By getEntry()
	{
		return By.tagName(entry);
	}
	public static By getCost()
	{
		return By.xpath(cost);
	}
	public static By getClkStartDate()
	{
		return By.xpath(ClkStartdate);
	}
	public static By getStartdate()
	{
		return By.tagName(Startdate);
	}
	public static By getClkEndDate()
	{
		return By.xpath(ClkEnddate);
	}
	public static By getEnddate()
	{
		return By.tagName(Enddate);
	}
}
