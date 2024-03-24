package Pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

public class Logotitle {
	WebDriver driver;
	@FindBy  (xpath="//*[@id=\"det_img_1597536773\"]")
		
	WebElement Logo;
	
	
	public Logotitle (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	public void logochecking()
	{
		if(Logo.isDisplayed())
		{
			System.out.println("logo is displayed");
			
		}
		else
			System.out.println("logo not displayed");
	}
}


	


