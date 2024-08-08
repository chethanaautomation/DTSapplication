package Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Home;
import pageObjects.Search;

public class TC002_Search extends Baseclass{
	
	@Test
	public void Home()
	{
		Home hm =new Home(driver);
		hm.username();
		hm.pwd();
		hm.loginto();
	

		Search sc =new Search(driver);
		sc.subbrand();
		sc.search();
	//	sc.searchtrigger();
		sc.enterAndSubmit("ALDNVTRFG51402");
		String confrimmesg = sc.getconfirmation();
		Assert.assertEquals(confrimmesg, "ADD");
	}
}
		
		
	


