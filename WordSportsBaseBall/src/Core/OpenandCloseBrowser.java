package Core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class OpenandCloseBrowser 
{
	protected static WebDriver driver;
	@Parameters({"browser", "baseURL"})
	
	@BeforeClass
	public void OpenBrowser(String browser, String baseURL)
	{
		if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		else if(browser.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.driver.ie", System.getProperty("user.dir")+"//");
			DesiredCapabilities caps=new DesiredCapabilities();
			caps.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
			caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS	, true);
			driver=new InternetExplorerDriver(caps);
		}
		
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.driver.chrome", System.getProperty("user.dir")+"//");
			driver=new FirefoxDriver();
		}
		
		else
		{
			driver=new FirefoxDriver();
		}
		
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		//driver.quit();
	}

}
