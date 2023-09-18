package seleniumpac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Alerts {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
	            "D:\\Java related project\\chromedriver_win32 (1)\\chromedriver.exe");
	        // Instantiate a ChromeDriver class.
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        // Maximize the browser
	        driver.manage().window().maximize();
	 
	        // Launch Website
	        driver.get("https://demoqa.com/alerts");
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,250)", "");
	        driver.findElement(By.xpath("//button[@id='promtButton']")).click();
	
	         // driver.switchTo().alert().sendKeys("pradeep");
	          
	          Alert alert = driver.switchTo().alert();
	          alert.sendKeys("value");
	          System.out.println(alert.getText()); 
	          Thread.sleep(2000);
	          alert.accept();
	        
	        
	}

}
