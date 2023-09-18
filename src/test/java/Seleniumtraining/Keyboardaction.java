package Seleniumtraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardaction {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
	            "D:\\Java related project\\chromedriver_win32 (1)\\chromedriver.exe");
	        // Instantiate a ChromeDriver class.
	        WebDriver driver = new ChromeDriver();
	        
	        
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        // Maximize the browser
	        driver.manage().window().maximize();
	 
	        // Launch Website
	        driver.get("https://text-compare.com/");
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,250)", "");
	        WebElement input1=driver.findElement(By.xpath("//textarea[@id='inputText1']"));
	        WebElement input2=driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		    
	        input1.sendKeys("java learning");
	        
		Actions data=new Actions(driver);
		
		//CTRL + A
         data .keyDown(Keys.CONTROL);
         data .sendKeys("a");
         data.keyUp(Keys.CONTROL);
         data.perform();
         
         //CTRL + C
         
         data .keyDown(Keys.CONTROL);
         data .sendKeys("c");
         data.keyUp(Keys.CONTROL);
         data.perform();
         
         // Tab -shift to input box
         data.sendKeys(Keys.TAB);
         data.perform();
         
         //CTRL + V
         data.keyDown(Keys.CONTROL);
         data.sendKeys("v");
         data.keyUp(Keys.CONTROL);
         data.perform();
         
         if(input1.getAttribute("value").equals(input2.getAttribute("value")))
         {
        	 System.out.println("Text copied");
         }
         else
         {
        	 System.out.println("Text not copied");
         }

	}

}
