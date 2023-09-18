package seleniumpac;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdownwithoutselect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
	            "D:\\Java related project\\chromedriver_win32 (1)\\chromedriver.exe");
	        // Instantiate a ChromeDriver class.
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        // Maximize the browser
	        driver.manage().window().maximize();
	 
	        // Launch Website
	        driver.get("https://demo.guru99.com/test/newtours/reservation.php");
	    
               driver.findElement(By.xpath("//input[@value='oneway']")).click();
               
               
               List<WebElement> options = driver.findElements(By.xpath("//select[@name='fromPort']/option"));

               for(WebElement sample : options)

               {

               if(sample.getText().equals("San Francisco"))

               {

               sample.click();

               break;

               }

               }
               
	}

}
