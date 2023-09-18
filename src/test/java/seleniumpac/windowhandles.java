package seleniumpac;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandles {

	public static void main(String[] args) throws Exception {

		 System.setProperty("webdriver.chrome.driver","D:\\Java related project\\Hybridframework\\drivers\\chromedriver.exe" );
	        // Instantiate a ChromeDriver class.
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        // Maximize the browser
	        driver.manage().window().maximize();
	        driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
			driver.manage().window().maximize();
			String parent=driver.getWindowHandle();
			System.out.println("parent window"+" "+parent);
			driver.findElement(By.xpath("//a[contains(@href,'http://www.facebook.com')][1]")).click();
			
			Set<String> allwindows=driver.getWindowHandles();
			int count=allwindows.size();
			System.out.println(count);
			
			for (String childwindows : allwindows)
                 {
				
                     System.out.println(childwindows);
				
				if(!parent.equalsIgnoreCase(childwindows))
				{
	driver.switchTo().window(childwindows);
					driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pradeep");
					
				}
			}
	  Thread.sleep(2000);
	  String facebook=driver.getWindowHandle();
	  System.out.println("facebook window"+" "+facebook);
      driver.switchTo().window(parent);
      
      Thread.sleep(2000);
      driver.findElement(By.xpath("//a[contains(@href,'http://www.yahoo.com')]")).click();
      Thread.sleep(2000);
      
      Set<String> newallwindows=driver.getWindowHandles();
		int newcount=newallwindows.size();
		System.out.println(newcount);
		
		for (String newchildwindows : newallwindows)
           {
			
               System.out.println(newchildwindows);
			
			if(!parent.equalsIgnoreCase(newchildwindows) && !facebook.equalsIgnoreCase(newchildwindows) )
			{
                 driver.switchTo().window(newchildwindows);
                 Thread.sleep(5000);
                 driver.findElement(By.xpath("//*[@id='ybar-sbq']")).sendKeys("kumara");
                 
				}
				}
		
		Thread.sleep(2000);
        driver.switchTo().window(facebook);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='email']")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pavan");
        Thread.sleep(2000);
        driver.quit();
		}
     
	}


