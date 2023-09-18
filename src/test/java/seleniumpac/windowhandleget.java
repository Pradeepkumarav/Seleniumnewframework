package seleniumpac;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;

public class windowhandleget {

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
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[contains(@href,'http://www.yahoo.com')]")).click();
			Thread.sleep(3000);
			
			Set<String> allwindows=driver.getWindowHandles();
			
			int count=allwindows.size();
			System.out.println(count);
			ArrayList<String> tabs=new ArrayList<>(allwindows);
			driver.switchTo().window(tabs.get(2));
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pradeep");
			Thread.sleep(4000);
			driver.switchTo().window(tabs.get(0));
			Thread.sleep(4000);
			driver.switchTo().window(tabs.get(1));// yahho.com
			Thread.sleep(2000);
			driver.close();


	}

}
