package test;

import org.testng.annotations.Test;

import base.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pages.Location;
import pages.ReservePage;
import pages.SignUp;
import pages.chooseDates;
import pages.chooseTimes;
import pages.chooseVehicle;

public class FlowValidation extends Base {
	AndroidDriver<AndroidElement> driver;

	
@Test
public void tc001_Flow_Validation()
{
	//*************PAGE INSTANTIATIONS*************
	SignUp sign = new SignUp(driver);
	Location location =new Location(driver);
	chooseDates dates = new chooseDates(driver);
	chooseTimes time =new chooseTimes(driver);
	chooseVehicle vehicle = new chooseVehicle(driver);
	ReservePage reserve =new ReservePage(driver);
	
	//Test flow validation 
	location.searchiconclick();
	location.searchfield("Los Angeles");
	location.selectcity();
	dates.pick();
	dates.drop();
	dates.applyChanges();
	time.pickupTime();
	time.DropTime();
	time.complete();
	vehicle.pickVehicle();
	reserve.reserveCar();
	sign.emailEnter("ash.ash@gmail.com");
	sign.enterpassword("hello1234");
	sign.clickSigup();
	
	
}

}
