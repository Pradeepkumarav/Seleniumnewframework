package Seleniumtraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardactionenter {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
	            "D:\\Java related project\\chromedriver_win32 (1)\\chromedriver.exe");
	        // Instantiate a ChromeDriver class.
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        // Maximize the browser
	        driver.manage().window().maximize();
	 
	        // Launch Website
	        driver.get("https://www.google.com/");
	        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("java");
	        
	        Actions data=new Actions(driver);
			
			//CTRL + A
	         data .keyDown(Keys.ENTER);
	       
	         data.perform();
	        
	        
	}

}
