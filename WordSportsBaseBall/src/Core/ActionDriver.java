package Core;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActionDriver
{
	protected WebDriver driver;
	
	public ActionDriver(WebDriver driver)
	{
	 this.driver=driver;	
	}
	
	public void TypeText(By loc, String value)
	{
		driver.findElement(loc).sendKeys(value);
	}
	public void Clear(By loc) 
	{
		driver.findElement(loc).clear(); 
	}
	public void Click(By loc)
	{
		driver.findElement(loc).click();
	}
	
	public String gettext(By loc)
	{
		return driver.findElement(loc).getText();
	}
	
	public void selectValue(By loc,String value)
	{
		WebElement element=driver.findElement(loc);
		Select s=new Select(element);
		s.selectByVisibleText(value);
	}
	
	public void CheckBox(By loc, String value)
	{
		List<WebElement> list=driver.findElements(loc);
		for(WebElement listvalue: list)
		{
			if(listvalue.getText().equals(value))
			{
				listvalue.click();
			}
		}
	}
	
	public void calender(By loc , String date)
	{
		List<WebElement> list =driver.findElements(loc);
		for(WebElement listvalue: list)
		{
			if(listvalue.getText().equals(date))
			{
				listvalue.click();
			}
		}
		
		
	}
	public void Check(By loc)
	{
		WebElement element=driver.findElement(loc);
		if(!element.isSelected())
		{
			element.click();
		}
	}
	public void MouseHover(By loc, By loc1)
	{
		WebElement element=driver.findElement(loc);
		WebElement element1=driver.findElement(loc1);
		Actions act= new Actions(driver);
		act.moveToElement(element).click(element1).build().perform(); 
	}
	public void Radio(By loc, String value)
	{
		List<WebElement> list=driver.findElements(loc);
		for(WebElement listvalue: list)
		{
			if(listvalue.getText().equals(value))
			{
				listvalue.click();
			}
		}
	}
	
	

}
