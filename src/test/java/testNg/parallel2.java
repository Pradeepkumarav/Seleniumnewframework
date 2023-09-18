package testNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallel2 {

	@Test
	   public void method1() {
	      System.out.println("Inside method1()");
	      //Assert.assertEquals(message, messageUtil.printMessage());
	      System.setProperty("webdriver.chrome.driver",
		            "D:\\Java related project\\chromedriver_win32 (1)\\chromedriver.exe");
		        // Instantiate a ChromeDriver class.
		        WebDriver driver = new ChromeDriver();
		        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		        // Maximize the browser
		        driver.manage().window().maximize();
		 
		        // Launch Website
		        driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		   
	   }
	@Test
	public void method2() {
	      System.out.println("Inside method2()");
	      //Assert.assertEquals(message, messageUtil.printMessage());
	      
	      System.setProperty("webdriver.chrome.driver",
		            "D:\\Java related project\\chromedriver_win32 (1)\\chromedriver.exe");
		        // Instantiate a ChromeDriver class.
		        WebDriver driver = new ChromeDriver();
		        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		        // Maximize the browser
		        driver.manage().window().maximize();
		 
		        // Launch Website
		        driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		   
	   }
	
	@Test
	public void method3() {
	      System.out.println("Inside method3()");
	      //Assert.assertEquals(message, messageUtil.printMessage());
	      
	      System.setProperty("webdriver.chrome.driver",
		            "D:\\Java related project\\chromedriver_win32 (1)\\chromedriver.exe");
		        // Instantiate a ChromeDriver class.
		        WebDriver driver = new ChromeDriver();
		        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		        // Maximize the browser
		        driver.manage().window().maximize();
		 
		        // Launch Website
		        driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		   
	   }
	
	
	@Test
	public void method4() {
	      System.out.println("Inside method4()");
	      //Assert.assertEquals(message, messageUtil.printMessage());
	      
	      System.setProperty("webdriver.chrome.driver",
		            "D:\\Java related project\\chromedriver_win32 (1)\\chromedriver.exe");
		        // Instantiate a ChromeDriver class.
		        WebDriver driver = new ChromeDriver();
		        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		        // Maximize the browser
		        driver.manage().window().maximize();
		 
		        // Launch Website
		        driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		   
	   }
}
