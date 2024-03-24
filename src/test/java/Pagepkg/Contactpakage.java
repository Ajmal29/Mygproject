package Pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactpakage {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"hm-whatsapp-button\"]")
	WebElement contact;
	@FindBy(xpath="//*[@id=\"footer-general_79\"]/div/ul/li[4]/a")
	WebElement contactus;
	public Contactpakage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void contactclick()
	{
		contact.click();
}
	public void contactusclick()
	{
		contactus.click();
	}
}
