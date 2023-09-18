package Seleniumtraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
public class Clickandhold {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
	            "D:\\Java related project\\chromedriver_win32 (1)\\chromedriver.exe");
	        // Instantiate a ChromeDriver class.
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        // Maximize the browser
	        driver.manage().window().maximize();
	 
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
