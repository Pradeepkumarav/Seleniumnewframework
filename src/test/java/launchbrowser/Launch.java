package launchbrowser;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

public class Launch  {

	
	public static void main(String[] args) throws Exception   {
		 System.setProperty("webdriver.chrome.driver",
		            "D:\\Java related project\\chromedriver_win32 (1)\\chromedriver.exe");
		        // Instantiate a ChromeDriver class.
		        WebDriver driver = new ChromeDriver();
		 
		        // Maximize the browser
		        driver.manage().window().maximize();
		 
		        // Launch Website
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		        
		        //driver.navigate.to("https://demo.guru99.com/test/newtours/index.php");
		        // Launch Website
		        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html"); 
		        JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("window.scrollBy(0,250)", "");
		     // Locate the element C by By.xpath. 
		          WebElement titleC = driver.findElement(By.xpath("//li[text()= 'C']")); 

		     // Create an object of actions class and pass reference of WebDriver as a parameter to its constructor. 
		          Actions actions = new Actions(driver); 

		     // Move the cursor to the position of element C. 
		          actions.moveToElement(titleC); // Call clickAndHold() method to perform click and hold operation. 
		          actions.clickAndHold().perform(); 
		}





   
	}

	


		      
		     
		       
		   
		      
		   //    boolean data=driver.findElement(By.cssSelector("input.inputtext[id=email]")).isEnabled();

            
	


