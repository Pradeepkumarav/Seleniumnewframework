package launchbrowser;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orangeloginpage {
		
		
		public orangeloginpage(WebDriver remotedriver)
		{
		
			PageFactory.initElements(remotedriver, this);;
		}
		
		//locating web elements present on the web page
		
		
		//name, id, class, linked text, partiallinked, 
		@FindBy(name = "username" )
		

		static WebElement username11;

		@FindBy(name = "password" )

		WebElement password;
		
		@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button" )
		

		WebElement submit;
	    public static void main(String[] args) {
	    	
	    	WebDriver driver = new ChromeDriver();
	    	
	    	orangeloginpage obj=new orangeloginpage(driver);
		System.setProperty("webdriver.chrome.driver",
	            "D:\\Java related project\\chromedriver_win32 (1)\\chromedriver.exe");
	        // Instantiate a ChromeDriver class.
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      // Maximize the browser
	      driver.manage().window().maximize();
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	        username11.sendKeys("pradeep");
	    
	 
	   
	}
	    
	    
	}

