package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;


import pageObjects.Home;

public class TC_001Registertest extends Baseclass{


@Test
public void Home()
{
	Home hm =new Home(driver);
	hm.username();
	hm.pwd();
	hm.loginto();
	String confrimmesg = hm.getconfirmation();
	Assert.assertEquals(confrimmesg, "SEASON");
}

/*public void Register() {
	

	Register Rs = new Register(driver);
	
	Rs.Register();
	Rs.Regidterid("12121212");
	Rs.email("chethana@algoshack.com");
	Rs.password("Chethu@3012");
	Rs.repassword("Chethu@3012");
	Rs.Phnono("9110290805");
	Rs.submit();
String	confrmssge =Rs.getconfirmation();
Assert.assertEquals(confrmssge,"User doesn't exist");
	
}*/

}