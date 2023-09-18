package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameterize {

	static  WebDriver driver; 
	@Parameters("browser")
	@Test
	public void setup(String br) {
		if(br.equals("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
		System.setProperty("webdriver.firefox.marionette","D:\\Java related project\\Firefoxdriver\\geckodriver.exe" );  
			driver = new FirefoxDriver();	
		}
		else if(br.equals("ie"))
		{
			
			
			 System.setProperty("webdriver.ie.driver", "D:\\Java related project\\Internetexplorer\\IEDriverServer.exe");  
		        WebDriver driver=new InternetExplorerDriver();  
		        
		}
		
		//driver.get("https://demo.guru99.com/test/newtours/");
		driver.navigate().to("https://demo.guru99.com/test/newtours/");
		
		
	}
}
