package Testpkg;

import org.testng.annotations.Test;

import Pagepkg.Logotitle;
import Pagepkg.Myglogin;


	public class Logotest extends Baseclass {
		
		@Test
			public void logotest()
			{
		Logotitle ob=new Logotitle(driver);
			ob.logochecking();
			}
}
