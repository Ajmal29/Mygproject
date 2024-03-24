package Testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pagepkg.Myglogin;



public class Mygtest extends Baseclass {
	
@Test
	public void test() throws InterruptedException
	{
	Myglogin ob=new Myglogin(driver);
	ob.profileclick();
	ob.loginclick();
	ob.setmobile("7025762916");
	ob.getcodeclick();
	Thread.sleep(2000);
	ob.sighnupclick();
	
	
	}
}
