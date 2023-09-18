package cookies;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Cookie;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Addnewcookie {

	public static void main(String[] args) {
		   WebDriverManager.chromedriver().setup();
	       WebDriver driver = new ChromeDriver();
	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       // Maximize the browser
	       driver.manage().window().maximize();

	       // Launch Website
	       driver.get("https://www.amazon.in/");
	       Cookie cookie= new Cookie("java","selenium");
	       driver.manage().addCookie(cookie);
	      Set<Cookie> Addedcookies = driver.manage().getCookies();
	      
	      for (Cookie cookie2 : Addedcookies) {
			System.out.println(cookie2);
		}
	}

}
