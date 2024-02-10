package InterviewDemo_java;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenLines {
	
	public static void main(String args[]) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AKILA RAJESH\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		List<WebElement> anchorTags=driver.findElements(By.tagName("a"));
		for(WebElement t:anchorTags)
		{
			String linkName=t.getAttribute("href");
			
			URL url=new URL(linkName);
	 		HttpURLConnection httpconnection=(HttpURLConnection)url.openConnection();
	 		httpconnection.connect();
	 		int responseCode=httpconnection.getResponseCode();
	 		
	 		if(responseCode<400)
	 		{
	 			System.out.println("yes given "+linkName+" is valid URL");
	 		}
	 		else
	 		{
	 			System.out.println("URL is broken URL");
	 		}
	 		

			
  		}
		driver.close();
		

}
}
