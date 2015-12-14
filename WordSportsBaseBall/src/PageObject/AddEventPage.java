package PageObject;

import org.openqa.selenium.WebDriver;

import Core.ActionDriver; 
import PageElements.AddEventElement;

public class AddEventPage extends ActionDriver 
{

	public AddEventPage(WebDriver driver) 
	{ 
		super(driver);
	}  
	
	public AddEventPage AddEvent()
	{
		Click(AddEventElement.getAddEvent());
		return this;
	}
	public AddEventPage Region(String region)
	{
		selectValue(AddEventElement.getRegion(), region);
		return this;
	}
	public AddEventPage TournamentType(String Ttype)
	{
		selectValue(AddEventElement.getTournamenttype(), Ttype);
		return this;
	}
	public AddEventPage EventCode(String code)
	{
		TypeText(AddEventElement.getEventCode(), code);
		return this;
	}
	public AddEventPage EventName(String name)
	{
		TypeText(AddEventElement.getEventName(), name);
		return this;
	}
	public AddEventPage EventType(String Etype)
	{
		selectValue(AddEventElement.getEventType(), Etype);
		return this;
	}
	public AddEventPage Gender(String gender)
	{
		selectValue(AddEventElement.getGender(), gender);
		return this;
	}
	public AddEventPage TeamAge()
	{
		Click(AddEventElement.getTeamAge());
		return this;
	}
	public AddEventPage SelectTeamAge(String value)
	{
		CheckBox(AddEventElement.getSelectTeamAge(), value);
		return this;
	}
	public AddEventPage Entry(String Entryvalue) 
	{
		Radio(AddEventElement.getEntry(), Entryvalue);
		return this;
	}
	public AddEventPage ClkStartdate()
	{
		Click(AddEventElement.getClkStartDate());
		return this;
	}
	public AddEventPage StartDate(String date)
	{
		TypeText(AddEventElement.getClkStartDate(), date);
		return this;
	}
	public AddEventPage ClkEnddate()
	{
		Click(AddEventElement.getEnddate());
		return this;
	}
	public AddEventPage EndDate(String date)
	{
		TypeText(AddEventElement.getClkEndDate(), date);
		return this;
	}
	   

}
