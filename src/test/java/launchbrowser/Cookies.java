package launchbrowser;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Cookies {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
	            "D:\\Java related project\\chromedriver_win32 (1)\\chromedriver.exe");
	        // Instantiate a ChromeDriver class.
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        // Maximize the browser
	        driver.manage().window().maximize();
	 
	        // Launch Website
      
	       driver.manage().window().maximize();

	       driver.get("https://www.amazon.in/");
	       
	       
	       Cookie cookie= new Cookie("java","selenium");
	       
	       driver.manage().addCookie(cookie);
	       
	      Set<Cookie> Addedcookies = driver.manage().getCookies();
	      
	      for (Cookie cookie2 : Addedcookies) {
			System.out.println(cookie2);


	      }

		}
	       

	}


