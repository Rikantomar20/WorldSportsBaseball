package PageObject;

import org.openqa.selenium.WebDriver;

import Core.ActionDriver;
import PageElements.CoachRegistrationElement;

public class CoachRegistrationPage extends ActionDriver
{
	public CoachRegistrationPage(WebDriver driver) 
	{
		super(driver);
	}
	
	
	public CoachRegistrationPage SignUp()
	{
		Click(CoachRegistrationElement.getSignUp());
		return this;
	}
	public CoachRegistrationPage SignUpAs(String value)
	{
		selectValue(CoachRegistrationElement.getsignupAs(), value);
		return this;
	}
	public CoachRegistrationPage ClckSignUp()
	{
		Click(CoachRegistrationElement.getclckSignup());
		return this;
	}
	public CoachRegistrationPage VerifyCoachsignUp()
	{
		assert gettext(CoachRegistrationElement.getVerifyCoachSignup()).equals("Coach Sign up"):"coach verify is fail";
		return this;
	}
	public CoachRegistrationPage TypeFirstName(String Fname)
	{
		TypeText(CoachRegistrationElement.getfirstName(), Fname);
		return this;
	}
	public CoachRegistrationPage TypeLastName(String LName)
	{
		TypeText(CoachRegistrationElement.getLastName(), LName);
		return this;
	}
	public CoachRegistrationPage TypeEmail(String email)
	{
		TypeText(CoachRegistrationElement.getEmail(), email);
		return this;
	}
	public CoachRegistrationPage TypeCell(String cell)
	{
		TypeText(CoachRegistrationElement.getCell(), cell);
		return this;
	}
	public CoachRegistrationPage SelectGender(String gender)
	{
		selectValue(CoachRegistrationElement.getGender(), gender);
		return this;
	}
	public CoachRegistrationPage TypeTeamName(String Tname)
	{
		TypeText(CoachRegistrationElement.getTeamName(), Tname);
		return this;
	}
	public CoachRegistrationPage ClckTeamAge()
	{
		Click(CoachRegistrationElement.getTeamage());
		return this;
	}
	public CoachRegistrationPage SelectTeamAge(String TeamAge)
	{
		CheckBox(CoachRegistrationElement.getselectTage(), TeamAge);
		return this;
	}
	public CoachRegistrationPage TypeAddress1(String add)
	{
		TypeText(CoachRegistrationElement.getAddress1(), add);
		return this;
	}
	public CoachRegistrationPage SelectState(String state)
	{
	    selectValue(CoachRegistrationElement.getState(), state);
	    return this;
	}
	public CoachRegistrationPage TypeCity(String city)
	{
		TypeText(CoachRegistrationElement.getCity(), city);
		return this;
	}
	public CoachRegistrationPage TypeZip(String zip)
	{
		TypeText(CoachRegistrationElement.getZip(), zip);
		return this;
	}
	public CoachRegistrationPage Submit()
	{
		Click(CoachRegistrationElement.getSubmit());
		return this;
	}
	public CoachRegistrationPage Reset()
	{
		Click(CoachRegistrationElement.getReset());
		return this;
	}

}
