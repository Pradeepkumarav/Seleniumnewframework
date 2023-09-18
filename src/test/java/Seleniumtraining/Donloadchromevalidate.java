package Seleniumtraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Donloadchromevalidate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
	            "D:\\Java related project\\chromedriver_win32 (1)\\chromedriver.exe");
	        // Instantiate a ChromeDriver class.
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        // Maximize the browser
	        driver.manage().window().maximize();
	 
	        // Launch Website
	        driver.get("https://www.google.com/chrome/?brand=CHBD&brand=CHBD&gclid=CjwKCAjw44mlBhAQEiwAqP3eVlBrf75Kx3K0ebpNbH"
	        		+ "xzpcmOowf_-euGQj0iIO_HouNZeHDUHsvcSRoC4OIQAvD_BwE&gclsrc=aw.ds");
	        driver.findElement(By.xpath("//button[@id='js-download-hero']")).click();
	        
	}

}
