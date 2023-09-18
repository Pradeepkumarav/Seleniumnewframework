package seleniumpac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
	            "D:\\Java related project\\chromedriver_win32 (1)\\chromedriver.exe");
	        // Instantiate a ChromeDriver class.
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        // Maximize the browser
	        driver.manage().window().maximize();
	 
	        // Launch Website
	        driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
			
			driver.manage().window().maximize();
			Thread.sleep(2000);
			int totalframes=driver.findElements(By.tagName("iframe")).size();
			System.out.println(totalframes);
			//WebElement iframe = driver.findElement(By.xpath("//frameset[1]/frameset[1]/frame[2]"));
			driver.switchTo().frame("globalSqa");
			driver.findElement(By.xpath("//span[@id='current_filter']")).click();
			driver.findElement(By.xpath("//div[contains(text(),'Software Testing')]")).click();
			Thread.sleep(2000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("window.scrollBy(0,250)", "");
			
			//driver.findElement(By.xpath("input[name='mytext3']")).sendKeys("pradeep");
			

	}

}
