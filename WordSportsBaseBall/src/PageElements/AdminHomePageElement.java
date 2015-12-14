package PageElements;

import org.openqa.selenium.By;

public class AdminHomePageElement 
{
	static String verifyName="//*[@id='liLogin']/button";
	
	public static By getVerify()
	{
		return By.xpath(verifyName);
	}

}
 