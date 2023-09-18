package testNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Dataproviderfeeddataapp {
	 WebDriver driver;
	 @BeforeClass
	public void launch() {
		System.setProperty("webdriver.chrome.driver",
	            "D:\\Java related project\\chromedriver_win32 (1)\\chromedriver.exe");
	        // Instantiate a ChromeDriver class.
	          driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        // Maximize the browser
	        driver.manage().window().maximize();
	 
	        
	        // Launch Website
	        driver.get("https://demo.nopcommerce.com/login?returnurl=%2F");
	}
	
	
	
	
	   @Test(dataProvider = "excelData",dataProviderClass = Dataprovider.class)
	    public void name(String username, String password) throws Exception {
		
		     Thread.sleep(1000);
	        driver.findElement(By.xpath("//input[@id='Email']")).clear();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(username);
	        driver.findElement(By.xpath("//input[@id='Password']")).clear();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
	        
	     
	}
}
