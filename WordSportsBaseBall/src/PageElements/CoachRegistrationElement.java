package PageElements;

import org.openqa.selenium.By;

public class CoachRegistrationElement 
{
	static String SignUp="//*[@id='ankSignUp']";
	static String signupAs="//*[@id='ddlLoginType']";
	static String clckSignup="//*[@id='btnLogin']";
	static String verifyCoachsignUp="//*[@id='ContentPlaceHolder1_divResiter']/div/div[1]/div[1]/h4";
	static String FName="//*[@id='ContentPlaceHolder1_txtfname']";
	static String LName="//*[@id='ContentPlaceHolder1_txtLastname']";
	static String Email="//*[@id='ContentPlaceHolder1_txtEmail']";
	static String cell="//*[@id='ContentPlaceHolder1_txtCellPhone']";
	static String gender="//*[@id='ContentPlaceHolder1_ddlGender']";  //*[@id='ContentPlaceHolder1_ddlGender']
	static String TeamName="//*[@id='ContentPlaceHolder1_txtTeamName']";
	static String Teamage="//*[@id='Button1']";
	static String selecttage="td";
	static String address1="//*[@id='ContentPlaceHolder1_txtMaillingAddress']";
	static String state="//*[@id='ContentPlaceHolder1_ddlState']";
	static String City="//*[@id='ContentPlaceHolder1_txtCity']";
	static String zip="//*[@id='ContentPlaceHolder1_txtZipCode']";
	static String submit="//*[@id='ContentPlaceHolder1_btnFirstStep']";
	static String reset="//*[@id='ContentPlaceHolder1_btnFirstStepReset']";
	
	
	public static By getSignUp()
	{
		return By.xpath(SignUp);
	}
	public static By getsignupAs()
	{
		return By.xpath(signupAs);
	}
	public static By getclckSignup()
	{
		return By.xpath(clckSignup);
	}
	public static By getVerifyCoachSignup()
	{
		return By.xpath(verifyCoachsignUp);
	}
	public static By getfirstName()
	{
		return By.xpath(FName);
	}
	public static By getLastName()
	{
		return By.xpath(LName);
	}
	public static By getEmail()
	{
		return By.xpath(Email);
	}
	public static By getCell()
	{
		return By.xpath(cell);
	}
	public static By getGender()
	{
		return By.xpath(gender);
	}
	public static By getTeamName()
	{
		return By.xpath(TeamName);
	}
	public static By getTeamage()
	{
		return By.xpath(Teamage);
	}
	public static By getselectTage()
	{
		return By.tagName(selecttage);
	}
	public static By getAddress1()
	{
		return By.xpath(address1);
	}
	public static By getState()
	{
		return By.xpath(state);
	}
	public static By getCity()
	{
		return By.xpath(City);
	}
	public static By getZip()
	{
		return By.xpath(zip);
	}
	public static By getSubmit()
	{
		return By.xpath(submit);
	}
	public static By getReset()
	{
		return By.xpath(reset);
	}

}
