package seleniumpac;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dropdown 
{
	 
	 public static void main(String[] args) throws Exception {
		
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
          
           
           Select selectByVisibleText = new Select (driver.findElement(By.xpath("//select[@name='fromPort']")));
           selectByVisibleText.selectByIndex(2);
           Thread.sleep(2000);
           selectByVisibleText.selectByValue("New York");
           Thread.sleep(2000);
           selectByVisibleText.selectByVisibleText("Sydney");
           Thread.sleep(2000);
           driver.findElement(By.xpath("//input[@value='Business']")).click();
           Thread.sleep(2000);
           
           

           
           
           
         
            
	     }
  }
