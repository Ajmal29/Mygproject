package Testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Pagepkg.Homepage;
import Pagepkg.Logotitle;

public class Hometest extends Baseclass{
	
	
	@Test
	public void newarrive() throws InterruptedException
	{
		
		
Homepage ob=new Homepage(driver);
	ob.newarrival();
	
	ob.latestclick();
	ob.tvclick();
	ob.buyclick();
	ob.cart();
	ob.titleverification();
	
	}
	
}



