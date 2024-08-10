package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Home;
import pageObjects.Search;
import pageObjects.addtocart;



public class TC_003Addtocart extends Baseclass {
	
//@Test
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
		sc.enterAndSubmit("ALSFACUFK72253");
		String confrimmesg = sc.getconfirmation();
		Assert.assertEquals(confrimmesg, "ADD");
	

	addtocart cart=new addtocart(driver);
	cart.selectsize();
	cart.addtocart();
			cart.shopingcat();
			 String shopingcart=cart.getconfirmationn();
			 Assert.assertEquals(shopingcart, "SUMMARY");
	}
	}

