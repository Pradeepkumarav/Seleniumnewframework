package cookies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Getspecificcookie {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
	       WebDriver driver = new ChromeDriver();
	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       // Maximize the browser
	       driver.manage().window().maximize();

	       // Launch Website
	       driver.get("https://www.amazon.in/");
	       int total  =driver.manage().getCookies().size();
	      Cookie data= driver.manage().getCookieNamed("session-id");
	      
	      System.out.println(data);

	}

}
