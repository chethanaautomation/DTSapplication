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
	void close()
	{
		driver.quit();
	}
}

