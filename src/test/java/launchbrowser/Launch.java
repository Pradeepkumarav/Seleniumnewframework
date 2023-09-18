package launchbrowser;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import io.restassured.response.Response;

import java.awt.Robot;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class Launch  {

	  static WebDriver driver;
	
	/*public static void triggerAlert(String alertMessage){
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("alert('"+alertMessage+"');");*/
	//}

	public static void main(String[] args) throws Exception   {
		 System.setProperty("webdriver.chrome.driver",
		            "D:\\Java related project\\chromedriver_win32 (1)\\chromedriver.exe");
		        // Instantiate a ChromeDriver class.
		      driver = new ChromeDriver();
		 
		        // Maximize the browser
		        driver.manage().window().maximize();
		 
		        // Launch Website
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		        
		        //driver.navigate.to("https://demo.guru99.com/test/newtours/index.php");
		        driver.get("https://www.amazon.in/");
		        int total=driver.manage().getCookies().size();
		        
		        System.out.println(total);
		        //Retrieving all the cookies
		        Set<Cookie> Cookies = driver.manage().getCookies();
		        
		        for (Cookie cookie : Cookies) {
		 		System.out.println("cookie name:  "+cookie.getName());
		 		System.out.println("cookie value:  "+cookie.getValue());
		 		System.out.println("cookie domain:  "+cookie.getDomain());
		 		System.out.println("cookie path:   "+cookie.getPath());
		 		System.out.println("cookie path:   "+cookie.getExpiry());
		 		System.out.println("-------------------------------------------");
		 	}

			       


      
      
           

		        




   
	}
}
	


		      
		     
		       
		   
		      
		   //    boolean data=driver.findElement(By.cssSelector("input.inputtext[id=email]")).isEnabled();

            
	


