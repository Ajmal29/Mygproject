package Pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searching {
WebDriver driver;
@FindBy (xpath="//*[@id=\"search_input\"]")
WebElement search;

@FindBy (xpath="//*[@id=\"tygh_main_container\"]/div[1]/div/div[2]/div/div[2]/div[4]/div/form/button/i")
WebElement click;

public void setsearchbar(String Searching)
{
	search.sendKeys(Searching);
	
	
}
public Searching (WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
public void buttonclick()
{
	click.click();
}
}
