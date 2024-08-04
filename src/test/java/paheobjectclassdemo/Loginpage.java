package paheobjectclassdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
//Constructor
	WebDriver driver;
	
	Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	//Locater
	@FindBy(xpath="//input[@id='userid']") 
	WebElement user_name;
	@FindBy(xpath="//input[@id='pwd']")
	WebElement pwd;
	@FindBy(xpath="//button[@id='login-btn']")
	WebElement submit;
	
	
	//actions methods
	public void username(String name)
	{
	user_name.sendKeys(name);
	}
	public void pwd(String password)
	{
		pwd.sendKeys(password);
	}
	public void submit()
	{
		submit.click();
	}
}
