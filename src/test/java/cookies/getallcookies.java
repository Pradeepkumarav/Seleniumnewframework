package cookies;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getallcookies {

	public static void main(String[] args) {
		
       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       // Maximize the browser
       driver.manage().window().maximize();

       // Launch Website
       driver.get("https://www.amazon.in/");
       int total=driver.manage().getCookies().size();
       
       System.out.println(total);
       //Retrieving all the cookies
       Set<Cookie> Cookies = driver.manage().getCookies();
       
       for (Cookie cookie : Cookies) {
		System.out.println("cookie name:  "+cookie.getName());
		System.out.println("cookie value:  "+cookie.getValue());
		System.out.println("cookie domain:  "+cookie.getDomain());
		System.out.println("cookie path:   "+cookie.getPath());
		System.out.println("cookie path:   "+cookie.getExpiry());
		System.out.println("-------------------------------------------");
	}
       
	}

}
