package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class chooseTimes 
{
	public chooseTimes(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id = 'com.silvercar.mobi:id/time' && @text='12:00']")
	public WebElement pickTime;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id = 'com.silvercar.mobi:id/time' && @text='5:00'")
	public WebElement dropTime;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text = 'Done']")
	public WebElement done;
	
	
	public void pickupTime()
	{
		this.pickTime.click();
	}
	
	public void DropTime()
	{
		this.dropTime.click();
	}
	
	public void waitfor() throws InterruptedException
	{
		this.wait();
	}
	
	public void complete()
	{
		this.done.click();
	}
}
