package launchbrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class displayed {

	
	static WebDriver driver=new ChromeDriver();
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
	            "D:\\Java related project\\chromedriver_win32 (1)\\chromedriver.exe");
	        // Instantiate a ChromeDriver class.
	
		 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        // Maximize the browser
	        driver.manage().window().maximize();
	        driver.get("https://demo.guru99.com/test/newtours/index.php");
	        WebElement element=   driver.findElement(By.xpath("//input[@value='oneway']"));
	      driver.findElement(By.xpath("//a[contains(text(),'Flights')]")).click();
	      Boolean condition= element.isDisplayed();
	   
	
	  System.out.println(condition);
	        
	        

	}

}
