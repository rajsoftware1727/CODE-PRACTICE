import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FindBrokenLines {
	public static void main(String args[]) throws IOException
	{
	System.setProperty("webdriver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64_new version\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	List<WebElement> list=driver.findElements(By.xpath("//a[contains(@href,'.com')]"));
	System.out.println(list.size());
	int brokenCount=0;
		int notbrokenCount=0;
	for(WebElement f:list)
	{
		String url=f.getAttribute("href");
 		System.out.println(url);
 		URL url1=new URL(url);
 		HttpURLConnection httpconnection=(HttpURLConnection)url1.openConnection();
 		httpconnection.connect();
 		int responseCode=httpconnection.getResponseCode();
 		 
 		if(responseCode>=400)
 		{
 			System.out.println("This "+url+" "+"is broken url");
 			brokenCount++;
 		}
 		else
 		{
 			System.out.println("This "+url+" "+"is not broken url");
 			notbrokenCount++;

 		}

	}
	//verify links are broken or not
	System.out.println(brokenCount);
	System.out.println(notbrokenCount);
	
 	driver.close();

}
}
