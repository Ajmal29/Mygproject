package Testpkg;

import org.testng.annotations.Test;

import Pagepkg.Scroolingorder;
import Pagepkg.Searching;

public class Scrollinordertest extends Baseclass{
	@Test

	public void order()
	{
		Scroolingorder ob=new 	Scroolingorder(driver);
		ob.orderclick();

}
}
