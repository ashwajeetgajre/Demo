package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Location {

	
	public Location(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text = 'searcch_Icon']")
	public WebElement searchIcon;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text = 'Search_field']")
	public WebElement searchField;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@index = '1']")
	public WebElement selectCity;	
	
	
	public void searchiconclick()
	{
		this.searchIcon.click();
	}
	
	public void searchfield(String cityname)
	{
		this.searchField.sendKeys(cityname);
	}
	
	public void selectcity()
	{
		this.selectCity.click();
	}
	
}
