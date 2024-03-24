package Pagepkg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scroolingorder {
WebDriver driver;
@FindBy(xpath="//*[@id=\"text_links_1016\"]/li[3]/a")
WebElement order;
public Scroolingorder(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void orderclick()
{
	JavascriptExecutor js=(JavascriptExecutor)driver;js.executeScript("window.scrollBy(0,750)","");
	order.click();
}
}