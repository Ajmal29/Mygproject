package Pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Homepage {
WebDriver driver;

@FindBy (xpath="//*[@id=\"tygh_main_container\"]/div[2]/div/div/div/div/div/div/div[1]/ul/li[3]/a[2]")
WebElement newarrival;
@FindBy(xpath="/html/body")
WebElement latest;
@FindBy(xpath="//*[@id=\"product_list_page1\"]/div[1]/div/form/div/div[5]/bdi/a")
WebElement tv;
@FindBy(xpath="//*[@id=\"tygh_main_container\"]/div[3]/div/div[1]/div/div/div/div[1]/div/div[3]/div/div[2]/div[2]/div[2]/div[8]/div/a")
WebElement buy;
@FindBy(xpath="//*[@id=\"button_cart_810001707\"]")
WebElement cart;

public Homepage (WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
public void newarrival()
{
	Actions act=new Actions(driver);
	act.moveToElement(newarrival).perform();
	
}
public void latestclick()
{
	latest.click();
}

//click on first mobile
public void tvclick()
{
	tv.click();
}
public void buyclick()
{
	buy.click();
}
public void cart() {
	cart.click();
}
public void titleverification()
{
	String exp="myg";
	String actualtitle=driver.getTitle();
	Assert.assertEquals(exp,actualtitle);
	System.out.println("pass");

}
}

