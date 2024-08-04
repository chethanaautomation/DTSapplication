package paheobjectclassdemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Logintest {
	WebDriver driver;
	@Test(priority=1)
void setup() {
	
	driver=new ChromeDriver();
	driver.get("https://www.mflbooking.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
}
	@Test(priority=2)
void Logintotest()
{
	Loginpage lp =new Loginpage(driver);
	lp.username("12121212");
	lp.pwd("Dress@123");
	lp.submit();
	
}
	@Test(priority=3)
void close()
{
	driver.quit();
}
}
