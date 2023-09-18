package launchbrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class POM {

	
  //WebElement register= driver.findElement(By.name("firstName")));
	
	
	
	    
		public POM(WebDriver remotedriver)
		{
			
			PageFactory.initElements(remotedriver,this);;
		}
		
	@FindBy(xpath = "//a[text()='REGISTER']")
	@CacheLookup
	WebElement register;
	
	//locating FirstName from Create User page
	@FindBy(name = "firstName")
	@CacheLookup
	WebElement firstName;
	
	//locating LastName from Create User page
	@FindBy(name = "lastName")
	@CacheLookup
	WebElement lastname;
	
	//locating LastName from Create User page
	@FindBy(name = "phone")
	@CacheLookup
	WebElement mobilenumber;

	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
            "D:\\Java related project\\chromedriver_win32 (1)\\chromedriver.exe");
        // Instantiate a ChromeDriver class.
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Maximize the browser
        driver.manage().window().maximize();
 
        // Launch Website
  
       driver.manage().window().maximize();

       driver.get("https://demo.guru99.com/test/newtours/register.php");
       
       POM obj=new POM(driver);
       obj.firstName.sendKeys("pradeep");
       
       
       
}

}



