package Testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass {
 WebDriver driver;
 @BeforeClass
 public void setup() {
	 driver = new ChromeDriver();
	 driver.get("https://www.mflbooking.in/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
 }
 @AfterClass
 public void close() {
	 driver.quit();
 }
}
