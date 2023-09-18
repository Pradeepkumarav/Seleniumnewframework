package launchbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter {

	
	@Test
	@Parameters("browser")
	public void setup(String br) {
		if(br.equals("chrome"))
		{
	

			System.setProperty("webdriver.chrome.driver",
		            "D:\\Java related project\\chromedriver_win32 (1)\\chromedriver.exe");
		        // Instantiate a ChromeDriver class.
		        WebDriver driver = new ChromeDriver();
		        driver.get("https://demo.guru99.com/test/newtours/");
		        driver.manage().window().maximize();
		       
		}
		else if(br.equals("firefox"))
		{
		System.setProperty("webdriver.firefox.marionette","D:\\Java related project\\Firefoxdriver\\geckodriver.exe" );  
			WebDriver driver = new FirefoxDriver();	
			driver.get("https://demo.guru99.com/test/newtours/");
			 driver.manage().window().maximize();
		}

	}
}
