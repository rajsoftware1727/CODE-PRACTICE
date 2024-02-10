package Interview;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class GridDemo {
	
	public static WebDriver driver;

	@Test
	public static void A() throws MalformedURLException
	{
	 String nodeurl="http://192.168.43.81:5555/wd/hub";
	 DesiredCapabilities d=new DesiredCapabilities();
		d.setBrowserName("Edge");
		d.setPlatform(Platform.WINDOWS);
		System.setProperty("driver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64_new version\\msedgedriver.exe");

	driver=new RemoteWebDriver(new URL(nodeurl),d);
 		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		 


		driver.close();
		
}
	
	
	 
	

}
