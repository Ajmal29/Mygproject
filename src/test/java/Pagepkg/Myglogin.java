package Pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myglogin {
	WebDriver driver;
	@FindBy  (xpath="//*[@id=\"sw_dropdown_1003\"]/div/i")
	WebElement profile;
	
	@FindBy (xpath="//*[@id=\"cs-login\"]")
	WebElement login;
	
	@FindBy (xpath="//*[@id=\"login_phone_popup1003\"]")
	WebElement phone;
	
	public void setmobile(String mobile)
	{
		phone.sendKeys(mobile);
	}
	@FindBy(xpath="//*[@id=\"otp_block_popup1003\"]/div[2]/div/button/span")
	WebElement getcode;
	
	@FindBy (xpath="//*[@id=\"otp_block_popup1003\"]/div[4]/div/button")
	WebElement sighnup;
	
	
	
	public Myglogin (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	public void profileclick()
	{
		profile.click();
	}
	public void loginclick()
	{
		login.click();
	}
	public void getcodeclick()
	{
		getcode.click();
	}
	public void sighnupclick()
	{
		sighnup.click();
	}
	
}


