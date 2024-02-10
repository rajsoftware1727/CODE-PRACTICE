package InterviewDemo_java;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CookiesDemo {
	
	public static void main(String args[]) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AKILA RAJESH\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
 		WebDriver driver=new ChromeDriver();	
		 
		 
		driver.get("http://www.google.com");
		Set<Cookie> cookie=driver.manage().getCookies();
		 
		System.out.println("cookie size is :" + cookie.size());
		for(Cookie s1:cookie)
		{
			System.out.println(s1.getName());
			 
		}
		Cookie c=new Cookie("Rajesh","12345");
		driver.manage().addCookie(c);
		cookie=driver.manage().getCookies();
		System.out.println("cookie size :"+cookie.size() );
		System.out.println(driver.manage().getCookieNamed("Rajesh"));
		 
 		 
		driver.close();
	}
	

}
