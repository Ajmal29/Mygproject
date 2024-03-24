package Testpkg;

import org.testng.annotations.Test;

import Pagepkg.Contactpakage;
import Pagepkg.Searching;

public class Contacttest extends Baseclass {
	@Test

	public void search()
	{
		Contactpakage ob=new Contactpakage(driver);
		//ob.contactclick();
		ob.contactusclick();
}
}