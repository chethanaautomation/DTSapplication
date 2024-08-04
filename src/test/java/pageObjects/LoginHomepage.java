package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginHomepage extends Basepage{

	
		// TODO Auto-generated constructor stub
		
	@FindBy(xpath = "//a[@class='dropdown-toggle font-12 clearfix text-left']//span[@class='header-Nameblk']")
    WebElement profile;
	@FindBy(xpath="//span[normalize-space()='My Profile']")
	WebElement myprofile;

    @FindBy(xpath = "//div[@id='tab-2']//div[@class='subBrandBlock season']//div[1]//a[1]//div[1]//div[1]//img[1]")
    WebElement subbrand;
    


    // Constructor
    public LoginHomepage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    
    // Action methods
    public void username() throws InterruptedException {
        profile.click();
        Thread.sleep(10);
    }
    public void myprofile() {
    	myprofile.click();
    }
    

    public void pwd() {
        subbrand.click();
    }
}

