package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import paheobjectclassdemo.Loginpage;

public class Testcase {
	
		WebDriver driver;
		@Test(priority=1)
	void setup() {
		
		driver=new ChromeDriver();
		driver.get("https://www.mflbooking.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	}
		@Test(priority=2)
	void Logintotest() throws InterruptedException
	{
		Homepage lp =new Homepage(driver);
		lp.username("1212121212");
		lp.pwd("Dress@123");
		lp.submit();
		
		
	}
		@Test(priority=3)
		void LoginHomepage() throws InterruptedException {
			LoginHomepage lh = new LoginHomepage(driver);
			
		}
	/*	@Test(priority=4)
	void close()
	{
		driver.quit();
	}*/
}
