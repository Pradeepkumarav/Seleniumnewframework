package mavenproject.mavenproject;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Launchbrowser 
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
		        driver.get("https://demo.guru99.com/test/newtours/register.php");
		    
           driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("pradeep");
           driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pradeep");
           
            
	     }
  }
