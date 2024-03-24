package Testpkg;

import org.testng.annotations.Test;

import Pagepkg.Searching;

public class Search extends Baseclass {
@Test

public void search()
{
	Searching ob=new Searching(driver);
	
	ob.setsearchbar("headset");
	ob.buttonclick();
}
}
